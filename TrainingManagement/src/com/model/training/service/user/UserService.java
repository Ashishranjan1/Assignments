package com.model.training.service.user;


import java.util.Optional;

import com.model.training.persistence.user.User;

public interface UserService {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password);
}