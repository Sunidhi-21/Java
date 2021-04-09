package com.xworkz.designpattern.singleton;

public class EagerInitSingleton {
	
	static final EagerInitSingleton eg = new EagerInitSingleton();
	
	EagerInitSingleton() {
		System.out.println("Eager Init");
	}
	
	public static EagerInitSingleton getInstance() {
		return eg;
	}
}
