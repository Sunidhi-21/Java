package com.xworkz.test.practice;

public class ArithmeticOperation {
	
	static int i=1;
	int a=1;

	public static void main(String[] args) {
		
		ArithmeticOperation add1 = new ArithmeticOperation();
		System.out.println("static: " +add1.i++);
		String str = "addition";
		System.out.println(str);
		add1.addition(2);
		
	}
	
	void addition(int b) {
		ArithmeticOperation add2 = new ArithmeticOperation();
		System.out.println("static: " +add2.i++);
		int c;
		c=a+b;
		add(c);
	}
	
	void add(int c) {
		int d=1;
		d=d+c;
		System.out.println("result:" +d);
	}
}
