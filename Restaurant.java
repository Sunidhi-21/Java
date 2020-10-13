package com.xworkz.methodoverriding.assignment;

public class Restaurant {
	
	private String name;
	private String location;
	private int branches;
	
	public Restaurant(String name, String location, int branches) {
		this.name = name;
		this.location = location;
		this.branches = branches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getBranches() {
		return branches;
	}

	public void setBranches(int branches) {
		this.branches = branches;
	}
	
	void serveFood() {
		System.out.println("serve veg and non-veg food");
	}
	
	void displayDetails() {
		System.out.println("name: "+name+"\n"+"location: "+location+"\n"+"branches: "+branches);
	}
	
}
