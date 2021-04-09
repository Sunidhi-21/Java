package com.xworkz.designpattern.singleton;

public class SingletonTester {

	public static void main(String[] args) {
		System.out.println(EagerInitSingleton.getInstance());
		
		System.out.println(StaticBlockSingleton.getinstance());
	}

}
