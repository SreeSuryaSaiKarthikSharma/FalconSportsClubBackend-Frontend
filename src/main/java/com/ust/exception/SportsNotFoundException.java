package com.ust.exception;

public class SportsNotFoundException extends Exception{

	private String message;

	public SportsNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	public SportsNotFoundException() {
		
	}
	
}
