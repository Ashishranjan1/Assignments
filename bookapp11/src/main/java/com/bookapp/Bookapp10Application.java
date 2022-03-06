package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.dao.User;
import com.bookapp.model.service.UserService;

@SpringBootApplication
public class Bookapp10Application implements CommandLineRunner{
 
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Bookapp10Application.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {

        userService.addUser(new User("raj", "raj121", "ROLE_ADMIN"));
        userService.addUser(new User("ekta", "ekta121", "ROLE_MGR"));
        userService.addUser(new User("gun", "gun121", "ROLE_EMP"));

    }
 
}