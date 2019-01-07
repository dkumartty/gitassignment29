package com.dhir.fsd.RestFulAPIAssignment21.service;

import java.util.List;

import com.dhir.fsd.RestFulAPIAssignment21.model.Book;


public interface BookService {

	public String addBook(Book book);
	public String updateBook(Book book);
	public String deleteBook(long bookId);
	public Book getBook(long bookId);
	public List<Book> getBooks();
}
