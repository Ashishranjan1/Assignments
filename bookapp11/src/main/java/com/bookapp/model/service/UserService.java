package com.bookapp.model.service;

import com.bookapp.model.dao.User;

public interface UserService {
    public User findByUsername(String username);
    public void addUser(User user);
}