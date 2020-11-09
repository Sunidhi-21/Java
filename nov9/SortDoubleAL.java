package com.xworkz.collections.arraylist.nov9;

import java.util.ArrayList;
import java.util.Collections;

public class SortDoubleAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> dblAL = new ArrayList<Double>();
		dblAL.add(0.01);
		dblAL.add(2.01);
		dblAL.add(7.01);
		dblAL.add(9.01);
		dblAL.add(8.01);
		dblAL.add(7.01);
		dblAL.add(45.01);
		dblAL.add(-9.01);
		dblAL.add(88.01);
		dblAL.add(7.01);
		System.out.println("Original AL: "+dblAL);
		System.out.println("----------------");
		
		Collections.sort(dblAL);
		System.out.println("Sorted in asc order: "+dblAL);
		System.out.println("----------------");
		
		Collections.sort(dblAL,Collections.reverseOrder());
		System.out.println("Sorted in desc order: "+dblAL);

	}

}
