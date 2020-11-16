package com.xworkz.collections.set.treeset_nov13;

import java.util.Iterator;
import java.util.TreeSet;

public class StrTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> strTS = new TreeSet<String>();
		strTS.add("e");
		strTS.add("a");
		strTS.add("i");
		strTS.add("o");
		strTS.add("u");
		
		System.out.println("Traversing using forEach");
		strTS.forEach((n)->System.out.println(n));
		System.out.println("--------------------");
		
		System.out.println("Traversing using iterator");
		Iterator<String> strItr = strTS.iterator();
		while(strItr.hasNext()) {
			System.out.println(strItr.next());
		}
		
		System.out.println("----------------------");
		System.out.println(strTS.contains("i"));//Returns true if this set contains the specified element
		
		System.out.println("----------------------");//Returns the first (lowest) element currently in this set.
		System.out.println(strTS.first());
		
		System.out.println("----------------------");//Returns the least element in this set greater than or equal to the given element
		System.out.println(strTS.ceiling("t"));
		
		System.out.println("----------------------");
		System.out.println(strTS.floor("p"));//Returns the greatest element in this set less than or equal to the given element
		
		System.out.println("----------------------");
		System.out.println(strTS.higher("c"));//Returns the least element in this set strictly greater than the given element
		
		System.out.println("----------------------");
		strTS.clear();//Removes all of the elements from this set.
		System.out.println(strTS);
	}

}
