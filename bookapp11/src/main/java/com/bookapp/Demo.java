package com.bookapp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Demo {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("raj"));
	}
}