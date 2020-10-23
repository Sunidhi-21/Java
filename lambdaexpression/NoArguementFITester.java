package com.xworkz.anonymousclass.lambdaexpression;

public class NoArguementFITester {
	
	public static void main(String[] args) {
		
		NoArguementFI noArguementFI = ()->{
				
				return "Hello World";
			};
			String str = noArguementFI.PrintHello();
			System.out.println(str);
		}
	
}


