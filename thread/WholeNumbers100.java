package com.xworkz.thread;

public class WholeNumbers100 extends Thread{

	@Override
	public void run() {
		System.out.println("Thread start: Id: "+Thread.currentThread().getId()+" Id: "+Thread.currentThread().getName());
		for(int i=50; i<=100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread end: Id: "+Thread.currentThread().getId()+" Id: "+Thread.currentThread().getName());
	}
}
