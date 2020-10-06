package com.xworkz.arrays.arraysassignment;

public class MarksOfAStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {57,60,55,70,78,66};
		int total=0;
		double per,div;
		
		for(int i=0 ; i<marks.length ; i++) {
			total = total+marks[i];
		}
			div=total/600.0;
			per = div*100.0;
			System.out.println("Total: "+total);
			System.out.println("Percentage: "+per);
	}

}
