package com.qa.service.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.qa.domain.Book;
import com.qa.util.JSONUtil;

@Alternative
@ApplicationScoped
public class BookMapRepository implements BookRepository {

	private final Long INITIAL_COUNT = 1L;
	private Map<Long, Book> bookMap;
	private Long ID;

	@Inject
	private JSONUtil util;

	public BookMapRepository() {
		this.bookMap = new HashMap<Long, Book>();
		ID = INITIAL_COUNT;
		initBookMap();
	}

	@Override
	public String getAllBooks() {
		return util.getJSONForObject(bookMap.values());
	}

	@Override
	public String createBook(String book) {
		ID++;
		Book newBook = util.getObjectForJSON(book, Book.class);
		bookMap.put(ID, newBook);
		return book;
	}

	@Override
	public String updateBook(Long id, String bookToUpdate) {
		Book newBook = util.getObjectForJSON(bookToUpdate, Book.class);
		bookMap.put(id, newBook);
		return bookToUpdate;
	}

	@Override
	public String deleteBook(Long id) {
		bookMap.remove(id);
		return "{\"message\": \"accout sucessfully removed\"}";
	}

	private void initBookMap() {
		Book book = new Book("BOOK", "2342", "james", "love");
		bookMap.put(1L, book);
	}

}
