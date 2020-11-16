package com.xworkz.collections.set.hashset_nov13;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> strHS = new HashSet<String>();
		strHS.add("Red");
		strHS.add("Green");
		strHS.add("Brown");
		strHS.add("Blue");
		strHS.add("Orange");
		strHS.add("Yellow");
		
		System.out.println("Traversing using forEach");
		strHS.forEach((n)->System.out.println(n));
		System.out.println("--------------------");
		
		System.out.println("Traversing using iterator");
		Iterator<String> strItr = strHS.iterator();
		while(strItr.hasNext()) {
			System.out.println(strItr.next());
		}
		
	}

}
