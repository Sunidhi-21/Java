package com.xworkz.runnable;

public class Welcome implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: "
				+ Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++)
			System.out.println("Welcome");
		System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: "
				+ Thread.currentThread().getName());

	}

	
}
