package com.xworkz.arrays.arraysassignment;

public class NoOfNonRepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vals[] = {25,14,19,25,10,14,22};
		int count=0;
		
		for(int i=0;i<vals.length;i++) {
			
			for(int j=0;j<vals.length;j++) {
				
				if(i!=j) {
				
				if(vals[i]==vals[j]) {
					count++;
				}
			}
			
			}
		}
		System.out.println("The number of non repeated numbers in the array is: "+(vals.length-count));
	}
}
