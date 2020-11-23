package com.xworkz.synchronization;

public class Multiples  {

	synchronized void print(int num) {

		System.out.println(
				"Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		
		for (int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(i*num));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println(
				"Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
	}
	
	
}
