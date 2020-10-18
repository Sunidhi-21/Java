package com.xworkz.interfaceconcept.assignment;

public abstract class BathingSoap implements Soap{

	String brand;
	int price;
	
	public void washing() {
		System.out.println("body washing");
	}
	
	public void lathering() {
		System.out.println("Lathers with soft water");
	}
	
	abstract public void texture();

	abstract public void displayDetails();
	

}

