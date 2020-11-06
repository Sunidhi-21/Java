package com.xworkz.collections.arraylist.nov5;

public class GlueStick {

	String brand;
	int price;
	double thickness;

	public GlueStick(String brand, int price, double thickness) {
		super();
		this.brand = brand;
		this.price = price;
		this.thickness = thickness;
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

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	@Override
	public String toString() {
		return "GlueStick [brand=" + brand + ", price=" + price + ", thickness=" + thickness + "]";
	}
	
	
	
	
}
