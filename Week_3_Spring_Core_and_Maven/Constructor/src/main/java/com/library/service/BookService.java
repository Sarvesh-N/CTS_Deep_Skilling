package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor injection used.");
        this.bookRepository = bookRepository;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter injection used.");
        this.bookRepository = bookRepository;
    }

    public void printBook() {
        System.out.println("Book: " + bookRepository.getBookName());
    }
}
