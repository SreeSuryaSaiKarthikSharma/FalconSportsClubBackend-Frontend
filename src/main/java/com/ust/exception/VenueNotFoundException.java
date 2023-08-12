package com.ust.exception;

public class VenueNotFoundException extends Exception{

	
	private String message;

	public VenueNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	public VenueNotFoundException() {
		
	}
}
