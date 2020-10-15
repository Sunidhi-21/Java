package com.xworkz.upcastingdowncasting.assignment;

public class Mp3Player {
	
	private String brand;
	private String price;
	
	public Mp3Player(){
		
	}

	public Mp3Player(String brand, String price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public void playSongs() {
		System.out.println("playing songs in wired or wireless/bt earphones");
	}
	
	public void bluetoothConnectivity() {
		System.out.println("may or may not have bluetooth connectivity");
	}
	
	public void displayDetails() {
		System.out.println("brand: "+brand+" | "+"price: "+price);
	}
}
