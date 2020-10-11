package com.xworkz.exceptionhandling.assignment;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=0,rem,quo;
		try {
		 rem=a%b;
		 quo=a/b;
		 
		}
		finally {
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println("End");
		}
	}

}
