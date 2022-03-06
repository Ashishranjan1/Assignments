package com.bookapp.securityconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bookapp.model.dao.User;
import com.bookapp.model.service.UserService;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		System.out.println("--------------------------"+ username);
		User user=userService.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("user is not found");
		}
		
		//-------it is going to convert ur user to user that spring sec understand
		
		return new SecUser(user);
//		return new 
//				org.springframework.security.core.userdetails
//				.User(user.getUsername(), user.getPassword(), 
//						AuthorityUtils.createAuthorityList(user.getProfile()));
	}

}
