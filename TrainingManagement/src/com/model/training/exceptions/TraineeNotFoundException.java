package com.model.training.exceptions;

public class TraineeNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -4347853785055998249L;

	public TraineeNotFoundException(String message) {
		super(message);
	}
}