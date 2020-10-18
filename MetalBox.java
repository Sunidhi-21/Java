package com.xworkz.interfaceconcept.assignment;

public abstract class MetalBox implements Box {

	public void storing() {
		System.out.println("storing all kind of items");
	}
	
	public void open() {
		System.out.println("opening the box");
	}
	
	public void close() {
		System.out.println("Closing the box");
	}

	abstract void listOfItems();
	
	abstract void displayDetails();
}
