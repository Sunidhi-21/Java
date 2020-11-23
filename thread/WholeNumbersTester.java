package com.xworkz.thread;

public class WholeNumbersTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread start: Id: "+Thread.currentThread().getId()+" Id: "+Thread.currentThread().getName());
		
		WholeNumbers50 wn50 = new WholeNumbers50();
		wn50.start();
		
		WholeNumbers100 wn100 = new WholeNumbers100();
		wn100.start();
		
		System.out.println("Thread end: Id: "+Thread.currentThread().getId()+" Id: "+Thread.currentThread().getName());
	}

}
