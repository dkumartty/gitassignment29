package com.dhir.fsd.RestFulAPIAssignment21.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dhir.fsd.RestFulAPIAssignment21.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

	Book findByBookId(long bookId);
	List<Book> findAll();
}
