package com.xworkz.libraryfunctionalinterface;

import java.util.function.Consumer;

public class ConsumerFITester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> consumer =  (i)->System.out.println("Integer : "+i);
		consumer.accept(10);
		
	}

}
