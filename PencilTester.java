package com.xworkz.MultipleInheritance.assignment;

public class PencilTester {
	
	public static void main(String[] args) {
		
		Pencil pencil = new Pencil(100,"Doms");
		System.out.println("brand: "+pencil.brand+" | "+"Price: "+pencil.price);
		pencil.write();
	}
}
