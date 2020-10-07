package com.xworkz.arrays.arraysassignment;

public class PenPencil {
	private String brand;
	private double size;
	private int price;
	
	public PenPencil(String brand, double size, int price) {
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void clicking() {
		System.out.println("click to push the lead to write");
	}
	
	public void writing() {
		System.out.println("write");
	}
	
	public void insertLead() {
		System.out.println("inserting lead");
	}
	
	public void removelead() {
		System.out.println("removing lead");
	}

	public void displayDetails() {
		
		System.out.println("brand: "+brand+"\n"+"size: "+size+"\n"+"price: "+price);
	}

}
