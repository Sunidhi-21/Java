package com.xworkz.collections.set.hashset_nov13;

import java.util.HashSet;
import java.util.Iterator;

public class WaterTester {

	public static void main(String[] args) {
		
		HashSet<Water>  waHS = new HashSet<Water>();
		
		Water w1 = new Water("Bisleri",10.0,0.5);
		Water w2 = new Water("Bailey",15.0,0.75);
		Water w3 = new Water("Kennley",20.0,1.0);
		Water w4 = new Water("AquaFina",30.0,2.0);
		
		waHS.add(w1);
		waHS.add(w2);
		waHS.add(w3);
		waHS.add(w4);
		
		System.out.println("Traversing using forEach");
		waHS.forEach((n)->System.out.println(n));
		System.out.println("--------------------");
		
		System.out.println("Traversing using iterator");
		Iterator<Water> waItr = waHS.iterator();
		while(waItr.hasNext()) {
			System.out.println(waItr.next());
		}
	}
}
