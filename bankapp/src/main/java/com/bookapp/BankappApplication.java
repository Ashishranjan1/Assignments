package com.bookapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
	}

}
