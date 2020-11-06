package com.xworkz.collections.arraylist.nov5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StringAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strAl = new ArrayList<String>();
		strAl.add("I");
		strAl.add("am");
		strAl.add("learning");
		strAl.add("java");
		strAl.add("collections");
		
		System.out.println("Traversing using enhanced for: ");
		for(String str : strAl) {
			System.out.println(str);
		}System.out.println("---------------------");
		
		Iterator<String> itr = strAl.iterator();
		System.out.println("Traversing using Iterator: ");
		while(itr.hasNext()) 
			System.out.println(itr.next());
		System.out.println("---------------------");
		
		ListIterator<String> lItr = strAl.listIterator();
		System.out.println("Traversing forward using listIterator: ");
		while(lItr.hasNext())
			System.out.println(lItr.next());
		
		System.out.println("---------------------");
		System.out.println("Traversing backward using listIterator: ");
		while(lItr.hasPrevious())
			System.out.println(lItr.previous());
		
		
		
	}

}
