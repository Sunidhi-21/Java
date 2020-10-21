package com.xworkz.MultipleInheritance.assignment;

public class Pencil {

	int price;
	String brand;
	
	public Pencil() {
		System.out.println("Pencil is used to write");
	}
	
	public Pencil(int price, String brand) {
		this();
		this.price = price;
		this.brand = brand;
	}
	
	void erase() {
		System.out.println("can erase what we've written");
	}
	
	void write() {
		this.erase();
	}
	
	
}
