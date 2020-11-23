package com.xworkz.synchronization;

public class MultiplesTester {

	public static void main(String[] args) {
		
		System.out.println(
				"Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		Multiples multiples = new Multiples();
		
		Runnable r1 =()->multiples.print(2);
		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> multiples.print(3);
		Thread t2 = new Thread(r2);
		t2.start();
		
		System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
	
	}
	
}
