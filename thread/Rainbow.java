package com.xworkz.thread;

import java.util.ArrayList;
import java.util.Iterator;

public class Rainbow implements Runnable {

	@Override
	 public void run() {
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Violet");
		colors.add("Indigo");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Red");
		
		Iterator<String> itr2 = colors.iterator();
		System.out.println("Traversing using Iterator: ");
		while(itr2.hasNext()) { 
			System.out.println(itr2.next());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---------------------");
	}

}
