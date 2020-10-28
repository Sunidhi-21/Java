package com.xworkz.libraryfunctionalinterface;

import java.util.function.Supplier;

public class SupplierFITester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Integer> supplier = ()->Integer.parseInt("30");
		System.out.println(supplier.get());
		
	}

}
