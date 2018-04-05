package com.qa.intergration;

import javax.inject.Inject;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.service.business.BookService;

import org.apache.log4j.Logger;

@Path("/book")
public class BookEndpoint {
	
	private static final Logger LOGGER = Logger.getLogger(BookEndpoint.class);

	@Inject
	private BookService service;

	@Path("/json")
	@GET
	@Produces({ "application/json" })
	public String getAllBooks() {
		LOGGER.info("BookEndpoint + getAllBooks");
		return service.getAllBooks();
	}

	@Path("/json")
	@POST
	@Produces({ "application/json" })
	public String addBook(String book) {
		LOGGER.info("BookEndpoint + addBook");
		return service.addBook(book);
	}

	@Path("/json/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateBook(@PathParam("id") Long id, String book) {
		LOGGER.info("BookEndpoint + updateBook");
		return service.updateBook(id, book);
	}

	@Path("/json/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteBook(@PathParam("id") Long id) {
		LOGGER.info("BookEndpoint + deleteBook");
		return service.deleteBook(id);

	}

	public void setService(BookService service) {
		LOGGER.info("BookEndpoint + setService");
		this.service = service;
	}

}
