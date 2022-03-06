package com.bookapp.securityconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;



import lombok.extern.apachecommons.CommonsLog;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


		
@Component
public class SecAuthEntryPoint extends BasicAuthenticationEntryPoint {
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
	AuthenticationException authException) throws IOException {
	response.setHeader("WWW-Authenticate", "Basic realm" + getRealmName());
	response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	PrintWriter printWriter=response.getWriter();
	printWriter.print("401 - please login contact amar");
	}
	
	@Override
	public void afterPropertiesSet() {
	setRealmName("training.com");
	super.afterPropertiesSet();
	}
	}