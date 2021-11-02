package com.polanco.desafioBibliotecaBooklet.model;

public class Libro {

	private Integer id;
	private String titulo;
	private Integer anio;
	private String autor;
	private String imprenta;
	private boolean disponible;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getImprenta() {
		return imprenta;
	}
	public void setImprenta(String imprenta) {
		this.imprenta = imprenta;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", año=" + anio + ", autor=" + autor + ", imprenta=" + imprenta
				+ ", disponible=" + disponible + "]";
	}
	
	

}
