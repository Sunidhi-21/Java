package com.xworkz.MultipleInheritance.assignment;

public interface ApplePhone {

	default void os() {
		System.out.println("ios");
	}
	
	default void model() {
		System.out.println("iphone11");
	}
}
