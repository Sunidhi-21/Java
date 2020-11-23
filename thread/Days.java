package com.xworkz.thread;

import java.util.ArrayList;
import java.util.Iterator;

 public class Days implements Runnable {

	@Override
	synchronized public void run() {
		
		ArrayList<String> daysOfWeek = new ArrayList<String>();
		daysOfWeek.add("Sunday");
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		
		Iterator<String> itr = daysOfWeek.iterator();
		System.out.println("Traversing using Iterator: ");
		while(itr.hasNext()) { 
			System.out.println(itr.next());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---------------------");
		
	}
	
}
