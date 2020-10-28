package com.xworkz.libraryfunctionalinterface;

import java.util.function.Function;

public class FunctionFITester {

	public static void main(String[] args) {
		
		try {
			
			Function<String, Integer> function = (str)->Integer.parseInt(str);
			System.out.println(function.apply("ph"));
		
		}catch (NumberFormatException e) {
			System.out.println(e+" please enter right string");
		}
		
	}


}
