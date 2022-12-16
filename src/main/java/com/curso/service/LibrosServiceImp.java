package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.LibrosDao;
import com.curso.model.Libro;

@Service
public class LibrosServiceImp implements LibrosService {

	@Autowired//Este LibrosService debe de entenderse con el dao, necesito tener acceso a LibrosDao para acceder a sus métodos
	LibrosDao dao;

	@Override
	public List<Libro> libros() {
		
		return dao.findAll();
	}

	@Override
	public Libro libroIsbn(int isbn) {
		
		return dao.findById(isbn).orElse(null);
		
	}

	@Override
	public void altaLibro(Libro libro) {
		
		dao.save(libro);
	}

	@Override
	public void actualizarLibro(Libro libro) {
		
		dao.save(libro);
	}

	@Override
	public List<Libro> eliminar(int isbn) {
		
		dao.deleteById(isbn);
		
		return dao.findAll();
	} 
}
