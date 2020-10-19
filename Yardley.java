package com.xworkz.interfaceconcept.assignment;

public class Yardley implements GasPerfume{

	String brand = "Yardley";
	int price = 100;

	public void open() {
		System.out.println("Open perfume bottle");
	}

	public void close() {
		System.out.println("Close perfume bottle");
	}

	public void spray() {
		System.out.println("Spray perfume");
	}

	public void displayDetails() {
		System.out.println("brand: " + brand + " | " + " type: " + type + " | " + "price: " + price+" | "+"Fragrance: "+fragrance);
	}
}
