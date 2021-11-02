package com.polanco.desafioBibliotecaBooklet.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.polanco.desafioBibliotecaBooklet.model.Libro;
import com.polanco.desafioBibliotecaBooklet.service.LibroService;

@Controller
public class LibroController {
	
	@Autowired
	LibroService libroService;
	
	@RequestMapping("")
	public String index(Model model) {
		
		try {
			model.addAttribute("libros", libroService.buscarTodo().getLibros());
			
		} catch (Exception e) {
			System.out.println(libroService.buscarTodo().getMensaje());
		}	
		
		return "index";
	}
	
	@RequestMapping( value = "/agregarLibro")
	public String agregarLibros(@ModelAttribute Libro libro,Model model) {
	
		try {
			int id = 0;
			if (libroService.buscarTodo().getLibros().size() == 0) {
				id = 1;
			}else {
				id = libroService.buscarTodo().getLibros().get(libroService.buscarTodo().getLibros().size()-1).getId()+1;
			}
			libro.setId(id);
			libroService.agregarLibro(libro);
			
		} catch (Exception e) {
			System.out.println(libroService.agregarLibro(libro).getMensaje());
		}
		
		return index(model);
	}
	
	@RequestMapping("/seleccionLibro")
	public String seleccionLibro(@RequestParam Integer id, Model model) {
		for (Libro tempLibro: libroService.buscarTodo().getLibros()) {
			if (id == tempLibro.getId()) {
				model.addAttribute("tempLibro", tempLibro);
				break;

			}

		}

		return index(model);
	}
	
	@RequestMapping(value =  "/eliminarLibro", method = RequestMethod.POST)
	public String eliminarLibro(@RequestParam(value = "id", required = false) Integer id, Model model) {
		if (id != null) {
			for (Libro tempLibro : libroService.buscarTodo().getLibros()) {
				if (id == tempLibro.getId()) {
					libroService.eliminar(tempLibro);
					break;

				}

			}

		}
		return index(model);
	}
	
	@RequestMapping("/modificarDisponible")
	public String modificarDisponible(@RequestParam(value = "id", required = true) Integer id,@RequestParam(value = "disponible", required = false) String disponible ,Model model) {
		
		for(Libro tempLibro :libroService.buscarTodo().getLibros()) {
			if (id == tempLibro.getId()) {
				tempLibro.setDisponible(Boolean.parseBoolean(disponible));
				libroService.actualizarDisponible(tempLibro);
				break;
			
		}
		
		}		
		return index(model);
	}
	
	@RequestMapping("/modificarLibro")
	public String modificarLibro(@RequestParam(value = "id", required = false) Integer id, @ModelAttribute("libro") Libro libro, Model modelo) {
		
		for(Libro tempLibro :libroService.buscarTodo().getLibros()) {
			if (libro.getId() == tempLibro.getId()) {
				libroService.actualizarLibro(libro);
				break;
			}
		}
		return index(modelo);
	}
	
	@RequestMapping(value = "/filtrar", method = RequestMethod.POST)
	public String filtrar(@RequestParam(value = "filtro", required = false) String filtro, Model modelo) {
		
		if(filtro.equals("")) {
			
			modelo.addAttribute("libros", libroService.buscarTodo().getLibros());
		}else if (libroService.buscarPorAutor(filtro).getLibros().size() == 0){
			
			modelo.addAttribute("libros", libroService.buscarPorTitulo(filtro).getLibros());
		
		}else {
			modelo.addAttribute("libros", libroService.buscarPorAutor(filtro).getLibros());
		}
		
			
		return "index"; 
	}

}

