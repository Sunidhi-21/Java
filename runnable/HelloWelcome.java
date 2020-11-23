package com.xworkz.runnable;

public class HelloWelcome {
		
	public static void main(String[] args) {

		System.out.println(
				"Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());

		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: "
						+ Thread.currentThread().getName());
				for (int i = 1; i <= 5; i++)
					System.out.println("Hello");
				System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: "
						+ Thread.currentThread().getName());

			}

		};

		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> {

			System.out.println(
					"Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
			for (int i = 1; i <= 10; i++)
				System.out.println("Welcome");
			System.out.println(
					"Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		};

		Thread t2 = new Thread(r2);
		t2.start();

		System.out.println(
				"Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());

	}

}
