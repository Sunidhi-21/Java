package com.xworkz.arrays.arraysassignment;

public class BooleanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=false;
		
		boolean[] vals = new boolean[5];
		vals[0] = true;
		vals[1] = true;
		vals[2] = a;
		vals[3] = a;
		vals[4] = a;
		
		
		int length = vals.length;
		System.out.println("length: "+length);
		
		for(int i=0; i<length ; i++) {
			System.out.println("Array vals using for: "+vals[i]);
		}
		
		for(boolean i : vals) {
			System.out.println("Array vals using for each: "+i);
		}
	}
}
