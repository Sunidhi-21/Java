package com.xworkz.runnable;

public class Hello implements Runnable{

	@Override
	public void run() {

		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: "
				+ Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++)
			System.out.println("Hello");
		System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: "
				+ Thread.currentThread().getName());

	}

}
