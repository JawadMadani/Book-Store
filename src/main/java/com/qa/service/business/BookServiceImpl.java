package com.qa.service.business;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.service.repository.BookRepository;

public class BookServiceImpl implements BookService {

	private static final Logger LOGGER = Logger.getLogger(BookService.class);

	@Inject
	private BookRepository repo;

	public String getAllBooks() {
		LOGGER.info("In BookServiceImpl getAllBooks ");
		return repo.getAllBooks();
	}

	@Override
	public String addBook(String book) {
		return repo.createBook(book);
	}

	@Override
	public String updateBook(Long id, String book) {
		return repo.updateBook(id, book);
	}

	@Override
	public String deleteBook(Long id) {
		return repo.deleteBook(id);

	}

	public void setRepo(BookRepository repo) {
		this.repo = repo;
	}
}
