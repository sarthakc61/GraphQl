package com.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.entities.Book;
import com.graphql.services.BookService;

@SpringBootApplication
public class GraphqlLearnApplication implements CommandLineRunner{
	
	@Autowired
	BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book b1 = new Book();
		b1.setTitle("Learn Java");
		b1.setDesc("asdf");
		b1.setPages(2000);
		b1.setPrice(3000);
		b1.setAuthor("sting");
		
		Book b2 = new Book();
		b2.setTitle("Learn Python");
		b2.setDesc("qwerty");
		b2.setPages(1000);
		b2.setPrice(1000);
		b2.setAuthor("Greg");
		
		this.bookService.create(b1);
		this.bookService.create(b2);
	}

}
