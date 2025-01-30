package com.example.jdbci.repositories;

import com.example.jdbci.models.Book;

import java.util.List;

public interface BookRepository extends BaseRepo<Book> {
    List<Book> findByAuthor(String author);
    List<Book> findAvailableBooks();
}

