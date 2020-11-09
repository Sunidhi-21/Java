package com.xworkz.collections.arraylist.nov9;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringAL {

	public static void main(String[] args) {
		
		ArrayList<String> strAL = new ArrayList<String>();
		strAL.add("I");
		strAL.add("Am");
		strAL.add("Happy");
		strAL.add("Today");
		System.out.println("Original string: "+strAL);
		System.out.println("----------------");
		
		Collections.sort(strAL);
		System.out.println("Sorted in asc order: "+strAL);
		System.out.println("----------------");
		
		Collections.sort(strAL,Collections.reverseOrder());
		System.out.println("Sorted in desc order: "+strAL);
		System.out.println("----------------");
		
		
	}
	
}
