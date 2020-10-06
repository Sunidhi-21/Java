package com.xworkz.arrays.classexamples;

public class FloatArray {

	static float[] vals = new float[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("Floating point values");
				
				vals[0]=9.0f;
				vals[1]=2.5f;
				vals[2]=3.4f;
				vals[3]=4.1f;
				vals[4]=0.8f;
				
				print();
				printUsingForEach();
	}
	
			public static void print() {
				for(int i=0;i<vals.length;i++) {
					System.out.println("Array vals using for: "+vals[i]);
				}
			}
			
			public static void printUsingForEach() {
				for(float i : vals) {
					System.out.println("Array vals using for each: "+i);
				}
			}
}
