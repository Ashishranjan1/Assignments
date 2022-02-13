package com.model.exception;

public class EmployeeNotFoundException extends RuntimeException{


	private static final long serialVersionUID = -4748576199051552628L;

	public EmployeeNotFoundException(String message) {
		super(message);
		}

}
