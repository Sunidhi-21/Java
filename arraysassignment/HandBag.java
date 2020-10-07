package com.xworkz.arrays.arraysassignment;

public class HandBag {
	
	private String brand;
	private String color;
	private int price;
	
	public HandBag(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}
	
	public void storing() {
		System.out.println("storing items");
	}
	
	public void opening() {
		System.out.println("open the bag zip");
	}
	
	public void closing() {
		System.out.println("close the bag zip");
	}
	
	void displayDetails() {
		
		System.out.println("brand: "+brand+"\n"+"color: "+color+"\n"+"price: "+price);
	}

}
