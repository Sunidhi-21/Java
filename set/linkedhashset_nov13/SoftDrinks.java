package com.xworkz.collections.set.linkedhashset_nov13;

public class SoftDrinks {

	private String brand;
	private int price;
	private double quantityInL;
	
	public SoftDrinks(String brand, int price, double quantityInL) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
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
		return "SoftDrinks [brand=" + brand + ", price=" + price + ", quantityInL=" + quantityInL + "]";
	}

}
