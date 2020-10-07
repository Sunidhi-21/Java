package com.xworkz.arrays.arraysassignment;

public class HandBagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandBag[] bagArray = new HandBag[3];
		String[] brand = new String[3];
		String[] color = new String[3];
		int[] price = new int[3];
		
		HandBag lavie = new HandBag("Lavie","red",1700);
		brand[0]=lavie.getBrand();
		color[0]=lavie.getColor();
		price[0]=lavie.getPrice();
		bagArray[0]=lavie;
		
		HandBag caprese = new HandBag("Caprese","yellow",1800);
		brand[1]=caprese.getBrand();
		color[1]=caprese.getColor();
		price[1]=caprese.getPrice();
		bagArray[1]=caprese;
		
		HandBag baggit = new HandBag("Baggit","green",1500);
		brand[2]=baggit.getBrand();
		color[2]=baggit.getColor();
		price[2]=baggit.getPrice();
		bagArray[2]=baggit;
		
		System.out.println("Hand bag brands: ");
		for(int i=0;i<brand.length;i++) {
			System.out.println("brand: "+brand[i]);
		}
		
		System.out.println("Hand bag colors: ");
		for(int i=0;i<color.length;i++) {
			System.out.println("color: "+color[i]);
		}
		
		System.out.println("Hand bag prices: ");
		for(int i=0;i<price.length;i++) {
			System.out.println("price: "+price[i]);
		}
		
		System.out.println("all handbag details: ");
		for(int i=0;i<bagArray.length;i++) {
			HandBag hb = bagArray[i];
			hb.displayDetails();
			hb.opening();
			hb.closing();
			hb.storing();
		}
		System.out.println("all handbag details using for each");
		for(HandBag hb : bagArray ) {
			hb.displayDetails();
			hb.opening();
			hb.closing();
			hb.storing();
		}

	}
}