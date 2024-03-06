package com.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
