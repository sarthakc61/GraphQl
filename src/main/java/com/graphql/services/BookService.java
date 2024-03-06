package com.graphql.services;

import java.util.List;

import com.graphql.entities.Book;

public interface BookService {
	
	Book create(Book book);
	
	List<Book> getAllBooks();
	
	Book get(int bookId);

}
