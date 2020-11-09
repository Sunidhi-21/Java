package com.xworkz.collections.arraylist.nov9;

public class Television {

	//brand, inches, type**
	
	private String brand;
	private int inches;
	private String type;
	
	public Television(String brand, int inches, String type) {
		super();
		this.brand = brand;
		this.inches = inches;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Television [brand=" + brand + ", inches=" + inches + ", type=" + type + "]";
	}
	
	
}
