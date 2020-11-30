package com.xworkz.test.practice;

public class Methods {
	
	public static void main(String[] args) {
		
		Methods methods = new Methods();
		methods.add();
		System.out.println(methods.sub(5,6));
	}
	
	void add() {
		int a=1,b=2,c;
		c=a+b;
		System.out.println(c);
	}
	
	int sub(int a,int b) {
		int c;
		c=a-b;
		return c;
	}

}
