package com.xworkz.test.practice;

public class Numbers10 extends Thread {

	@Override
	public void run(){
		System.out.println("Start:  Name: "+Thread.currentThread().getName()+"Id: "+Thread.currentThread().getId());
		for(int i=1;i<=10;i++)
			System.out.println(i);
		System.out.println("End:  Name: "+Thread.currentThread().getName()+"Id: "+Thread.currentThread().getId());
	}
	
}
