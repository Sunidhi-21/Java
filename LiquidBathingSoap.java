package com.xworkz.interfaceconcept.assignment;

public class LiquidBathingSoap extends BathingSoap {

	String color;

	@Override
	public void washing() {
		System.out.println("Liquid soap used for body washing");
	}

	@Override
	public void lathering() {
		System.out.println("more lather");
	}

	public void texture() {
		System.out.println("Liquid");
	}

	public void displayDetails() {
		System.out.println("Brand: " + brand + "price: " + price + "Color: " + color);
	}

}
