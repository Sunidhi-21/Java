package com.xworkz.abstraction.assignment;

public abstract class Phone {

	String brand;
	String color;
	
	abstract void calling();
	abstract void photos();
	abstract void message();
	
	void primaryFunction() {
		System.out.println("Make phone calls");
	}
	
	void displayDetails() {
		System.out.println("brand: "+brand+" | "+"Color: "+color);
	}
}
