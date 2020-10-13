package com.xworkz.methodoverriding.assignment;

public class CookingOil extends Oil {

	private String type;
	
	public CookingOil() {
		
	}

	public CookingOil(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	void usage() {
		System.out.println("only cooking");
	}
	
	void displayDetails1() {
		System.out.println("type: "+type);
	}
		
	
	
}
