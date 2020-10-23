package com.xworkz.anonymousclass.lambdaexpression;

public class OneArgumentFITester {

	public static void main(String[] args) {
		
		OneArgumentFI oneArgumentFI = (a)->{
			int b = a+5;
			return b;
		};
		int add5 = oneArgumentFI.incrementByFive(1);
		System.out.println("increment by 5: "+add5);
	}
}
