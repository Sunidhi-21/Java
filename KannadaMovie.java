package com.xworkz.interfaceconcept.assignment;

public abstract class KannadaMovie implements Movie {

	String name;
	String actor;
	
	public void buyTicket() {
		// TODO Auto-generated method stub
		System.out.println("buy kannada movie ticket");
	}

	
	public void watching() {
		// TODO Auto-generated method stub
		System.out.println("watch kannada movie");
	}

	
	public void actors() {
		// TODO Auto-generated method stub
		System.out.println("Kannada actors");
	}
	
	abstract void displayDetails();
	
}
