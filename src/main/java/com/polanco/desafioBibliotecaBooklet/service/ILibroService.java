package com.polanco.desafioBibliotecaBooklet.service;


import com.polanco.desafioBibliotecaBooklet.VO.LibroVO;
import com.polanco.desafioBibliotecaBooklet.model.Libro;

public interface ILibroService {

	public LibroVO agregarLibro(Libro libro);
	public LibroVO buscarTodo();
	public LibroVO buscarPorTitulo(String titulo);
	public LibroVO buscarPorAutor(String autor);
	public LibroVO actualizarLibro(Libro libro);
	public LibroVO actualizarDisponible(Libro libro);
	public LibroVO eliminar(Libro libro);
	
}
