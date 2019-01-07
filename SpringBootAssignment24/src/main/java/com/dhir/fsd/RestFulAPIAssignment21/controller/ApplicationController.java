package com.dhir.fsd.RestFulAPIAssignment21.controller;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhir.fsd.RestFulAPIAssignment21.model.Book;
import com.dhir.fsd.RestFulAPIAssignment21.model.Response;
import com.dhir.fsd.RestFulAPIAssignment21.service.BookServiceImpl;


@RestController
public class ApplicationController {

	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	
	@GetMapping(value="/book/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Book> getBook(@PathVariable(name="id", required=true) long id) {
		
		Book book = bookServiceImpl.getBook(id);
		if(book==null){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
	
	@GetMapping(value="/books", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Book>>getBooks() {
		
		List<Book> books = bookServiceImpl.getBooks();
		
		if(CollectionUtils.isEmpty(books)){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/book/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Response> deleteBook(@PathVariable(name="id", required=true) long id) {
		
		String message = bookServiceImpl.deleteBook(id);
		Response response = new Response();
		response.setMessage(message);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@PostMapping(value="/book", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Response> addBook(@RequestBody Book book) {
		
		String message = bookServiceImpl.addBook(book);
		Response response = new Response();
		response.setMessage(message);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping(value="/book", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Response> updateBook(@RequestBody Book book) {
		
		String message = bookServiceImpl.updateBook(book);
		Response response = new Response();
		response.setMessage(message);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
