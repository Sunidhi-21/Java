package com.xworkz.arrays.arraysassignment;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] vals={1.4,2.5,3.0,6.0,4.0};
		
		for(int i=0;i<vals.length;i++) {
			System.out.println("Array vals using for: "+vals[i]);
		}
		
		for(double i : vals) {
			System.out.println("Array vals using for each:"+i);
		}

	}

}
