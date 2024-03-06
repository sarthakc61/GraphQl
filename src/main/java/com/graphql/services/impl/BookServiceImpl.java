package com.graphql.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.entities.Book;
import com.graphql.repositories.BookRepo;
import com.graphql.services.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	public BookServiceImpl(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public Book create(Book book) {
		return this.bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return this.bookRepo.findAll();
	}

	@Override
	public Book get(int bookId) {
		return this.bookRepo.findById(bookId).orElseThrow();
	}

}
