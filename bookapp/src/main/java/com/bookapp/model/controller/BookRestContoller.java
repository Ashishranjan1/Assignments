package com.bookapp.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.entities.Book;
import com.bookapp.model.service.BookService;

@RestController
public class BookRestContoller {
 
    private BookService bookService;
 
    @Autowired
    public BookRestContoller(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping(path = "books")
    public List<Book>getAll(){
        return bookService.getAllBooks();
    }
}