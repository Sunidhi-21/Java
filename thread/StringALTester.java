package com.xworkz.thread;

public class StringALTester {

	public static void main(String[] args) {
		
		Days days = new Days();
		Thread t1 = new Thread(days);
		t1.start();
		
		Rainbow rainbow = new Rainbow();
		Thread t2 = new Thread(rainbow);
		t2.start();
		
	}
}
