package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.entities.Book;
import com.bookapp.model.service.BookService;

@SpringBootApplication
public class bookappApplication implements CommandLineRunner{

	@Autowired
	private BookService bookservice;
	public static void main(String[] args) {
		SpringApplication.run(bookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		//bookservice.addBook(new Book("ashish", 45000.0, "java"));
	}

}
