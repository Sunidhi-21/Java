package com.xworkz.interfaceconcept.assignment;

public class GeometryBox extends MetalBox implements Box {

	String brand;
	int price;

	public void storing() {
		System.out.println("For storing geometrical instruments");
	}

	public void listOfItems() {
		System.out.println("Compass,protractor,scale,divider,set squares,sharpener,eraser,etc..");
	}

	public void displayDetails() {
		System.out.println("Brand: " + brand + " | " + "Price: " + price);
	}


}
