package com.xworkz.exceptionhandling.assignment;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println("start");
		
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.method1();
		System.out.println("end");
		
	}
	
	void method1() {
		System.out.println("U are in method 1");
		try {
			method2();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	void method2() {
		System.out.println("U are in method 2");
		method3();
	}
	void method3() {
		System.out.println("U are in method 3");
		String wish[] = {"all ","the ","best!"};
		for(int i=0;i<4;i++)
			System.out.print(wish[i]+" ");
	}
	
}
