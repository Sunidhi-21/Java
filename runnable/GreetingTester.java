package com.xworkz.runnable;

public class GreetingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: "
				+ Thread.currentThread().getName());
		
		Hello h = new Hello();
		Thread t1 = new Thread(h);
		t1.start();
		
		Welcome w = new Welcome();
		Thread t2 = new Thread(w);
		t2.start();
		
		System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: "
				+ Thread.currentThread().getName());
		
	}

}
