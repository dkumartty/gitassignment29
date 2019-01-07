package com.dhir.fsd.RestFulAPIAssignment21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhir.fsd.RestFulAPIAssignment21.model.Book;
import com.dhir.fsd.RestFulAPIAssignment21.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public String addBook(Book book) {
		bookRepository.save(book);
		return "Book inserted successfully with Id -"+book.getBookId();
	}

	@Override
	public String updateBook(Book book) {
		Book bookToUpdate = bookRepository.findByBookId(book.getBookId());
		
		bookToUpdate.setPrice(book.getPrice());
		bookToUpdate.setTitle(book.getTitle());
		bookToUpdate.setVolume(book.getVolume());
		bookToUpdate.setPublishDate(book.getPublishDate());
		
		bookRepository.save(bookToUpdate);
		return "Book updated successfully with Id -"+book.getBookId();
	}

	@Override
	public String deleteBook(long bookId) {
		bookRepository.deleteById(bookId);
		return "Book deleted with Id -"+bookId;
	}

	@Override
	public Book getBook(long bookId) {
		Book book = bookRepository.findByBookId(bookId);
		return bookRepository.findByBookId(bookId);
	}

	@Override
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

}
