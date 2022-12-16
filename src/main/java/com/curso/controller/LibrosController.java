package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Libro;
import com.curso.service.LibrosService;

@RestController
public class LibrosController {

	@Autowired //Aquí le ponemos la referencia
	LibrosService service;//El controller se comunica con el service
	
	//Métodos
	@GetMapping(value = "libros", produces=MediaType.APPLICATION_JSON_VALUE)
	List<Libro> libros(){
		return service.libros();
	}
	
	@GetMapping(value = "libros/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
	Libro libroIsbn(@PathVariable ("isbn") int isbn) {
		return service.libroIsbn(isbn);
	}
	
	@PostMapping(value = "librosAlta", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void altaLibro(@RequestBody Libro libro) {
		 service.altaLibro(libro);
	}
	
	@PutMapping(value = "librosActualizar", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarLibro(@RequestBody Libro libro) {
		service.actualizarLibro(libro);
	}
	
	@DeleteMapping(value = "librosDelete/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> eliminar(@PathVariable int isbn){
		return service.eliminar(isbn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
