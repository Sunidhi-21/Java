package com.xworkz.collections.arraylist;

import java.util.ArrayList;

public class DoubleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> weight =  new ArrayList<Double>();
		
		weight.add(32.8);
		weight.add(35.3);
		weight.add(42.2);
		weight.add(56.5);
		
		System.out.println("size of the array: "+weight.size());
		
		for(int i=0;i<weight.size();i++) 
			System.out.println(weight.get(i));
		System.out.println("--------------------------");
		
		for(Double i : weight)
			System.out.println(i);
		System.out.println("--------------------------");
		
		weight.set(2,56.23);
		System.out.println(weight);
		System.out.println("--------------------------");
		
		System.out.println(weight.get(weight.size()-1));
		System.out.println("--------------------------");
		
		weight.remove(0);
		System.out.println(weight);
		System.out.println("--------------------------");
		
		weight.remove(new Double(56.23));
		System.out.println(weight);
		
	}

}

//o/p: size of the array: 4
//32.8
//35.3
//42.2
//56.5
//--------------------------
//32.8
//35.3
//42.2
//56.5
//--------------------------
//[32.8, 35.3, 56.23, 56.5]
//--------------------------
//56.5
//--------------------------
//[35.3, 56.23, 56.5]
//--------------------------
//[35.3, 56.5]
