package com.polanco.desafioBibliotecaBooklet.VO;

import java.util.List;

import com.polanco.desafioBibliotecaBooklet.model.Libro;

public class LibroVO {

	private List<Libro> libros;
	private String mensaje;
	private String codigo;
	
	
	public LibroVO(List<Libro> libros, String mensaje, String codigo) {
		this.libros = libros;
		this.mensaje = mensaje;
		this.codigo = codigo;
	}
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "LibroVO [libros=" + libros + ", mensaje=" + mensaje + ", codigo=" + codigo + "]";
	}
	
	
	
}
