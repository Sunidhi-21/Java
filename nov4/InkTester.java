package com.xworkz.collections.arraylist.nov4;

import java.util.ArrayList;

public class InkTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ink> inkAl = new ArrayList<Ink>();
		
		Ink i1 =  new Ink("Camlin",30,"Black");
		Ink i2 =  new Ink("Camlin",30,"Green");
		Ink i3 =  new Ink("Bril",40,"Royal Blue");
		Ink i4 =  new Ink("Bril",40,"Black");
		Ink i5 =  new Ink("Camlin",35,"Red");
		Ink i6 = new Ink("Bril",45,"Green");
		
		inkAl.add(i1);
		inkAl.add(i2);
		inkAl.add(i3);
		inkAl.add(i4);
		
		System.out.println("Traversing using forEach():");
		inkAl.forEach((n)->System.out.println(n));
		System.out.println("---------------------");
		
		System.out.println("Traversing using for:");
		for(int i=0; i<inkAl.size();i++) {
			Ink ink = inkAl.get(i);
			System.out.println(ink);
		}System.out.println("---------------------");
		
		System.out.println("Traversin using enhanced for:");
		for(Ink i : inkAl) {
			System.out.println(i);
		}System.out.println("--------------------");
		
		System.out.println("display last element: ");
		System.out.println(inkAl.get(inkAl.size()-1));
		System.out.println("---------------------");
		
		System.out.println("update 3rd element with new element ");
		inkAl.set(3, i5);
		System.out.println(inkAl);
		System.out.println("---------------------");	
		
		System.out.println("update 0th element with new element ");
		inkAl.set(0,i6);
		System.out.println(inkAl);
		System.out.println("---------------------");
	
		
	}

}
