package com.xworkz.methodoverriding.assignment;

public class RestaurantTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VegRestaurant ctr = new VegRestaurant("Shri Sagar(CTR)","Malleshwaram",1,"South Indian","Masala dosa");
		ctr.displayDetails();
		ctr.displayDetails1();
		
		System.out.println();
		
		System.out.println("displaying details using getters and setters: ");
		
		ctr.setName("Shri Sagar(CTR)");
		System.out.println("Name: "+ctr.getName());
		ctr.setLocation("Malleshwaram");
		System.out.println("Location: "+ctr.getLocation());
		ctr.setBranches(1);
		System.out.println("Branches: "+ctr.getBranches());
		ctr.setType("South Indian");
		System.out.println("Type: "+ctr.getType());
		ctr.setSpecialDish("Masala Dosa");
		System.out.println("Special dish: "+ctr.getSpecialDish());
		
		System.out.println();
		
		VegRestaurant rajdhani = new VegRestaurant("Rajdhani","Orion mall",11,"North Indian","Rajdhani Thali");
		rajdhani.displayDetails();
		rajdhani.displayDetails1();
		 
	}

}
