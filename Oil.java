package com.xworkz.methodoverriding.assignment;

public class Oil {
	
	private String brand;
	private int price;
	private int quantityInLitres;
	
	public Oil() {
		
	}
	
	public Oil(String brand, int price, int quantityInLitres) {
		this.brand = brand;
		this.price = price;
		this.quantityInLitres = quantityInLitres;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantityInLitres() {
		return quantityInLitres;
	}

	public void setQuantityInLitres(int quantityInLitres) {
		this.quantityInLitres = quantityInLitres;
	}

	void usage() {
		System.out.println("used for cooking,hair nourishing");
	}
	
	void displayDetails() {
		System.out.println("brand: "+brand+"\n"+"price: "+price+"\n"+"quantityInLitres: "+quantityInLitres);
	}
	
}
