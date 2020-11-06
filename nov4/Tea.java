package com.xworkz.collections.arraylist.nov4;

public class Tea {

	private String brand;
	private int price;
	private boolean instant;

	public Tea(String brand, int price, boolean instant) {
		super();
		this.brand = brand;
		this.price = price;
		this.instant = instant;
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

	public boolean isInstant() {
		return instant;
	}

	public void setInstant(boolean instant) {
		this.instant = instant;
	}

	@Override
	public String toString() {
		return "Tea [brand=" + brand + ", price=" + price + ", instant=" + instant + "]";
	}
	
	
	
}
