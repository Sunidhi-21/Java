package com.xworkz.collections.set.hashset_nov13;

public class Water {

	private String brand;
	private double price;
	private double quantityInL;
	
	public Water(String brand, double price, double quantityInL) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantityInL = quantityInL;
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

	public double getQuantityInL() {
		return quantityInL;
	}

	public void setQuantityInL(double quantityInL) {
		this.quantityInL = quantityInL;
	}

	@Override
	public String toString() {
		return "Water [brand=" + brand + ", price=" + price + ", quantityInL=" + quantityInL + "]";
	}
	
}
