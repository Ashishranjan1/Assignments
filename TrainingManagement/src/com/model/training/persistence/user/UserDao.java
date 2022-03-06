package com.model.training.persistence.user;

import java.util.Optional;

import com.model.training.exceptions.UserNotFoundException;

public interface UserDao {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password) throws UserNotFoundException;
}