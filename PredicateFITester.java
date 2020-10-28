package com.xworkz.libraryfunctionalinterface;

import java.util.function.Predicate;

public class PredicateFITester {
	
	public static void main(String[] args) {
		
		Predicate<String> predicate = (b)->b.length()>0;
		System.out.println(predicate.test(""));
		
		Predicate<Integer> predicate2 = (b)->b%2==0;
		System.out.println(predicate2.test(10));
	}
}
