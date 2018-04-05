package com.qa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String title;
	private String isbn;
	private String author;
	private String genre;

	public Book() {

	}

	public Book(String title, String isbn, String author, String genre) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.genre = genre;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String getisbn() {
		return isbn;
	}

	public void setisbn(String isbn) {
		this.isbn = isbn;
	}

	public String getauthor() {
		return author;
	}

	public void setauthor(String author) {
		this.author = author;
	}
	
	public String getgenre() {
		return genre;
	}

	public void setgenre(String genre) {
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
