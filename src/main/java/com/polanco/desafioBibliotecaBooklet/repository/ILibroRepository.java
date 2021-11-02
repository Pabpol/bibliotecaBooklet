package com.polanco.desafioBibliotecaBooklet.repository;

import java.util.List;

import com.polanco.desafioBibliotecaBooklet.model.Libro;

public interface ILibroRepository {
	
	public Integer agregarLibro(Libro libro);
	public List<Libro> buscarTodo();
	public List<Libro> buscarPorTitulo(String titulo);
	public List<Libro> buscarPorAutor(String autor);
	public Integer actualizarLibro(Libro libro);
	public Integer actualizarDisponible(Libro libro);
	public Integer eliminar(Libro libro);
	
	

}
