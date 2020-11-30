package com.xworkz.test.practice;

public interface Dad {
	
	default void features() {
		System.out.println("skin colour");
	}
}
