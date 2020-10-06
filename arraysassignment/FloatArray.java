package com.xworkz.arrays.arraysassignment;

public class FloatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Floating point values");
		
		float[] vals = new float[5];
		
		vals[0]=9.0f;
		vals[1]=2.5f;
		vals[2]=3.4f;
		vals[3]=4.1f;
		vals[4]=0.8f;
		
		for(int i=0;i<vals.length;i++) {
			System.out.println("Array vals using for: "+vals[i]);
		}
		
		for(float i : vals) {
			System.out.println("Array vals using for each:"+i);
		}

	}

}
