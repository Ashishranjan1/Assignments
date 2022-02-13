package com.service;


import java.util.Optional;

import com.persistence.User;
import com.persistence.UserDao;
import com.persistence.UserDaoImpl;


public class UserServiceImpl implements UserService{

	private UserDao userdao=null;
	public UserServiceImpl() {
		userdao=new UserDaoImpl();
	}

	@Override
	public void addUser(User user) {
		userdao.addUser(user);
		
	}

	@Override
	public Optional<User> getUser(String username, String password) {
		return userdao.getUser(username, password);
	}

}