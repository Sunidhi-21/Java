package com.xworkz.collections.linkedlist_nov12;

public class Eraser {

	private String brand;
	private double price;
	private int length;
	
	public Eraser(String brand, double price, int length) {
		super();
		this.brand = brand;
		this.price = price;
		this.length = length;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Eraser [brand=" + brand + ", price=" + price + ", length=" + length + "]";
	}
	
}
