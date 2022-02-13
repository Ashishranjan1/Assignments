package com.service;

import java.util.Optional;

import com.persistence.User;

public interface UserService {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password);
}