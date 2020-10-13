package com.xworkz.methodoverriding.assignment;

public class VegRestaurant extends Restaurant {

	String type;
	String specialDishes;
	
	public VegRestaurant(String name, String location, int branches, String type, String special) {
		super(name, location, branches);
		this.type = type;
		this.specialDishes = special;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecialDish() {
		return specialDishes;
	}

	public void setSpecialDish(String specialDishes) {
		this.specialDishes = specialDishes;
	}
	
	@Override
	void serveFood() {
		System.out.println("only vegetarian food");
	}

	void displayDetails1() {
		System.out.println("Type: "+type+"\n"+"special dish: "+specialDishes);
	}
}
