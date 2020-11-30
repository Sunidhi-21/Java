package com.xworkz.test.practice;

public class Child implements Dad,Mom {

	@Override
	public void features() {
		Dad.super.features();
		Mom.super.features();
	} 
}
