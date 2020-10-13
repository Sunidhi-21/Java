package com.xworkz.methodoverriding.assignment;

public class OilTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oil sunGold = new Oil("sun gold",70,1);
		sunGold.displayDetails();

		CookingOil sunFlower = new CookingOil("sunflower oil");
		sunFlower.displayDetails1();
		sunFlower.usage();
		
		System.out.println();
		
		Oil suffola = new Oil("suffola",150,2);
		suffola.displayDetails();
		
		CookingOil riceBran = new CookingOil("rice bran oil");
		riceBran.displayDetails1();
		riceBran.usage();
		
		System.out.println();
		
		CookingOil groundnut = new CookingOil();
		
		groundnut.setBrand("sun pure");
		System.out.println("brand: "+groundnut.getBrand());
		groundnut.setPrice(80);
		System.out.println("price: "+groundnut.getPrice());
		groundnut.setQuantityInLitres(1);
		System.out.println("quantity in litres: "+groundnut.getQuantityInLitres());
		groundnut.setType("groundnut oil");
		System.out.println("type: "+groundnut.getType());
		groundnut.usage();
	}

}
