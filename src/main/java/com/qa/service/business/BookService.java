package com.qa.service.business;

public interface BookService {

	String getAllBooks();

	String addBook(String book);

	String updateBook(Long id, String book);

	String deleteBook(Long id);

}