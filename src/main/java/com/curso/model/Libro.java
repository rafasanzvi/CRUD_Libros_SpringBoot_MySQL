package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Anotación que le dice que es una entidad
@Table(name="libros") //La tabla que se va a utilizar
public class Libro {
	
	@Id
	private int isbn;
	private String titulo;
	private String tematica;
	
	//Constructor vacío
	public Libro() {
		super();
	}
	
	//Constructor con la clave primaria
	public Libro(int isbn) {
		super();
		this.isbn = isbn;
	}

	//Constructor con todos los campos
	public Libro(int isbn, String titulo, String tematica) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.tematica = tematica;
	}

	//Getters and Setters
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	
	
}
