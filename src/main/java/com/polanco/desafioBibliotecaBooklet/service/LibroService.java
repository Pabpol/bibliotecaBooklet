package com.polanco.desafioBibliotecaBooklet.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polanco.desafioBibliotecaBooklet.VO.LibroVO;
import com.polanco.desafioBibliotecaBooklet.model.Libro;
import com.polanco.desafioBibliotecaBooklet.repository.ILibroRepository;

@Service
public class LibroService implements ILibroService{
	
	@Autowired
	ILibroRepository libroRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(LibroService.class);
	
	private LibroVO libroVO;
	
	@Override
	public LibroVO agregarLibro(Libro libro) {
		libroVO = new LibroVO(new ArrayList<Libro>(),"Ocurrió un error al agregar el libro","1");
		try {
			libroRepository.agregarLibro(libro);
			libroVO.setLibros(new ArrayList<Libro>());
			libroVO.setMensaje("El libro fué agregado con éxito");
			libroVO.setCodigo("0");
		} catch (Exception e) {
			logger.error(String.format("Error en LibroService: buscar todo:" + e));
		}
		return libroVO;
	}

	@Override
	public LibroVO buscarTodo() {
		libroVO = new LibroVO(new ArrayList<Libro>(),"Ocurrió un error al listar los libros","1");
		try {
			libroVO.setLibros(libroRepository.buscarTodo());
			libroVO.setMensaje("Los libros fueron listados con éxito");
			libroVO.setCodigo("0");
		} catch (Exception e) {
			logger.error(String.format("Error en LibroService: buscar todo:" + e));
		}
		return libroVO;
	}

	@Override
	public LibroVO buscarPorTitulo(String titulo) {
		libroVO = new LibroVO(new ArrayList<Libro>(),"Ocurrió un error al listar los libros","1");
		try {
			libroVO.setLibros(libroRepository.buscarPorTitulo(titulo));
			libroVO.setMensaje("Los libros fueron listados con éxito");
			libroVO.setCodigo("0");
		} catch (Exception e) {
			logger.error(String.format("Error en LibroService: buscar todo:" + e));
		}
		return libroVO;
	}

	@Override
	public LibroVO buscarPorAutor(String autor) {
		libroVO = new LibroVO(new ArrayList<Libro>(),"Ocurrió un error al listar los libros","1");
		try {
			libroVO.setLibros(libroRepository.buscarPorAutor(autor));
			libroVO.setMensaje("Los libros fueron listados con éxito");
			libroVO.setCodigo("0");
		} catch (Exception e) {
			logger.error(String.format("Error en LibroService: buscar todo:" + e));
		}
		return libroVO;
	}

	@Override
	public LibroVO actualizarLibro(Libro libro) {
		libroVO = new LibroVO(new ArrayList<Libro>(),"Ocurrió un error al actualizar el libro","1");
		try {
			libroRepository.actualizarLibro(libro);
			libroVO.setLibros(new ArrayList<Libro>());
			libroVO.setMensaje("El libro fué actualizado con éxito");
			libroVO.setCodigo("0");
		} catch (Exception e) {
			logger.error(String.format("Error en LibroService: buscar todo:" + e));
		}
		return libroVO;
	}

	@Override
	public LibroVO actualizarDisponible(Libro libro) {
		libroVO = new LibroVO(new ArrayList<Libro>(),"Ocurrió un error al actualizar disponible del libro","1");
		try {
			libroRepository.actualizarDisponible(libro);
			libroVO.setLibros(new ArrayList<Libro>());
			libroVO.setMensaje("El estado disponible ha sido actualizado con éxito");
			libroVO.setCodigo("0");
		} catch (Exception e) {
			logger.error(String.format("Error en LibroService: buscar todo:" + e));
		}
		return libroVO;
	}

	@Override
	public LibroVO eliminar(Libro libro) {
		libroVO = new LibroVO(new ArrayList<Libro>(),"Ocurrió un error al eliminar el libro","1");
		try {
			libroRepository.eliminar(libro);
			libroVO.setLibros(new ArrayList<Libro>());
			libroVO.setMensaje("El libro fué eliminado con éxito");
			libroVO.setCodigo("0");
		} catch (Exception e) {
			logger.error(String.format("Error en LibroService: buscar todo:" + e));
		}
		return libroVO;
	}

}
