package com.xworkz.collections.arraylist.nov9;

import java.util.ArrayList;
import java.util.Collections;


public class CountryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Country> ctryAL = new ArrayList<Country>();
		
		Country c1 = new Country(29,"India",91);
		Country c2 = new Country(6,"Australia",61);
		Country c3 = new Country(50,"United states",1);
		Country c4 = new Country(26,"Brazil",55);
		Country c5 = new Country(16,"Germany",49);
		
		ctryAL.add(c1);
		ctryAL.add(c2);
		ctryAL.add(c3);
		ctryAL.add(c4);
		ctryAL.add(c5);
		System.out.println("Original AL: ");
		ctryAL.forEach((n)->System.out.println(n));
		System.out.println("--------------------------");
		
		System.out.println("sorting using comparable");
		Collections.sort(ctryAL);
		System.out.println(ctryAL);
		System.out.println("--------------------------");
		
		System.out.println("sorting in descending order");
		Collections.reverse(ctryAL);
		System.out.println(ctryAL);


	}

}
