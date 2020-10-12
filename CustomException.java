package com.xworkz.exceptionhandling.customexceptions;

public class CustomException extends RuntimeException {
	
	public CustomException() {

		super("enter a number greater than zero");
	}
}