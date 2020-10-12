package com.xworkz.exceptionhandling.customexceptions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using Scanner to input a number"+"\n"+"Enter the number: ");
		
		Scanner sc = new Scanner(System.in);
		factorial(sc.nextInt());
		
		System.out.println();
		
		System.out.println("Using args to give input");
		
		String str = args[0];
		int n1=Integer.parseInt(str);
		System.out.println("The number is: "+n1);
		factorial(n1);
		
	}

	private static void factorial(int n) {
		
		if(n==0) {
			CustomException ce = new CustomException();
			throw ce;
		}

		int m;
		
		m=n;
		
		for(int i=m-1; i>=1 ; i--) {
			
			m*=i;
			
		}
			
		System.out.println("The factoial of " + n + " is " +m);
	}

}
