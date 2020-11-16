package com.xworkz.collections.set.linkedhashset_nov13;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SoftDrinksTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<SoftDrinks> sdLHS = new LinkedHashSet<SoftDrinks>();
		
		SoftDrinks sd1 = new SoftDrinks("CocaCola",30,0.5);
		SoftDrinks sd2 = new SoftDrinks("Pepsi", 32, 0.52);
		SoftDrinks sd3 = new SoftDrinks("Sprite",60,1.0);
		SoftDrinks sd4 = new SoftDrinks("7up", 34, 0.53);
		SoftDrinks sd5 = new SoftDrinks("Fanta", 60,1.2);
		SoftDrinks sd6 = new SoftDrinks("Mirinda", 62, 1.23);
		
		sdLHS.add(sd1);
		sdLHS.add(sd2);
		sdLHS.add(sd3);
		sdLHS.add(sd4);
		sdLHS.add(sd5);
		sdLHS.add(sd6);
		
		System.out.println("Traversing using forEach");
		sdLHS.forEach((n)->System.out.println(n));
		System.out.println("--------------------");
		
		System.out.println("Traversing using iterator");
		Iterator<SoftDrinks> sdItr = sdLHS.iterator();
		while(sdItr.hasNext()) {
			System.out.println(sdItr.next());
		}
		
	}

}
