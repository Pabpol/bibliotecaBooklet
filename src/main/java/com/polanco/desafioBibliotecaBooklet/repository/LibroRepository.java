package com.polanco.desafioBibliotecaBooklet.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.polanco.desafioBibliotecaBooklet.mapper.LibroMapper;
import com.polanco.desafioBibliotecaBooklet.model.Libro;

@Repository
public class LibroRepository implements ILibroRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer agregarLibro(Libro libro) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT into libro values (?,?,?,?,?,?)"
				, libro.getId()
				, libro.getTitulo()
				, libro.getAnio()
				, libro.getAutor()
				, libro.getImprenta()
				, libro.isDisponible()
				
				);
	}

	@Override
	public List<Libro> buscarTodo() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM libro", new LibroMapper());
	}

	@Override
	public List<Libro> buscarPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM libro WHERE titulo = ?", new LibroMapper(), new Object[] {titulo});
	}

	@Override
	public List<Libro> buscarPorAutor(String autor) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM libro WHERE autor = ?", new LibroMapper(), new Object[] {autor});
	}

	@Override
	public Integer actualizarLibro(Libro libro) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE libro set titulo = ?, anio = ?, autor = ?,imprenta = ?,disponible = ? where id = ?"
				
				, libro.getTitulo()
				, libro.getAnio()
				, libro.getAutor()
				, libro.getImprenta()
				, libro.isDisponible()
				, libro.getId()
				);
	}

	@Override
	public Integer actualizarDisponible(Libro libro) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE libro set disponible = ? WHERE id = ?"
				, libro.isDisponible()
				, libro.getId()
				);
		
	}

	@Override
	public Integer eliminar(Libro libro) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("DELETE from libro where id = ?"
				, libro.getId()
				);
	}

}
