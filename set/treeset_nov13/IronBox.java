package com.xworkz.collections.set.treeset_nov13;

public class IronBox {

	private String brand;
	private int price;
	private int powerInWatts;
	private String type;
	
	public IronBox(String brand, int price, int powerInWatts,String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.powerInWatts = powerInWatts;
		this.type = type;
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

	public int getPowerInWatts() {
		return powerInWatts;
	}

	public void setPowerInWatts(int powerInWatts) {
		this.powerInWatts = powerInWatts;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "IronBox [brand=" + brand + ", price=" + price + ", powerInWatts=" + powerInWatts + ", type=" + type+"]";
	}
	
}
