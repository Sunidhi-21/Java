package com.xworkz.collections.arraylist.nov5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GlueStickTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<GlueStick> gsAl = new ArrayList<GlueStick>();
		GlueStick gs1 = new GlueStick("FeviStik", 15 , 2.0);
		GlueStick gs2 = new GlueStick("Camlin", 20 , 2.0);
		GlueStick gs3 = new GlueStick("FaberCastle",30 , 5.0);
		GlueStick gs4 = new GlueStick("Scotch", 25, 2.0);
		GlueStick gs5 = new GlueStick("Kores", 35, 5.0);
		
		gsAl.add(gs1);
		gsAl.add(gs2);
		gsAl.add(gs3);
		gsAl.add(gs4);
		gsAl.add(gs5);
		
		System.out.println("Traversing using enhanced for: ");
		for(GlueStick gs : gsAl)
			System.out.println(gs);
		System.out.println("---------------------");
		
		System.out.println("Traversing using iterator: ");
		Iterator<GlueStick> gsItr = gsAl.iterator();
		while(gsItr.hasNext())
			System.out.println(gsItr.next());
		System.out.println("---------------------");
		
		ListIterator<GlueStick> gsLItr = gsAl.listIterator();
		System.out.println("Traversing forward using listIterator: ");
		while(gsLItr.hasNext())
			System.out.println(gsLItr.next());
		System.out.println("---------------------");
		
		System.out.println("Traversing backward using listIterator: ");
		while(gsLItr.hasPrevious())
			System.out.println(gsLItr.previous());
		System.out.println("---------------------");
		
	}

}
