package com.ust.exception;

public class StudentNotFoundException extends Exception {

	private String message;

	public StudentNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	public StudentNotFoundException() {
		
	}
}
