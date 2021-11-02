package com.polanco.desafioBibliotecaBooklet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.polanco.desafioBibliotecaBooklet.model.Libro;
import com.polanco.desafioBibliotecaBooklet.service.ILibroService;

@SpringBootApplication
public class DesafioBibliotecaBookletApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBibliotecaBookletApplication.class, args);
//		AnnotationConfigApplicationContext acac =  new AnnotationConfigApplicationContext(AppConfig.class);
//		ILibroService libroService = acac.getBean(ILibroService.class);
//		Libro libro = new Libro();
//		
//		libro.setId(10);
//		libro.setTitulo("La cocina y los alimentos");
//		libro.setAnio(1995);
//		libro.setAutor("Harold McGee");
//		libro.setImprenta("Debate");
//		libro.setDisponible(true);
//		
//		
//		System.out.println(libroService.buscarPorTitulo("El señor de los anillos").getLibros().get(0));
	}

}
