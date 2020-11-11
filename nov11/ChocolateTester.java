package com.xworkz.collections.queue.nov11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ChocolateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chocolate c1 = new Chocolate("DairyMilk", 20, "Milk Choco");
		Chocolate c2 = new Chocolate("MilkyBar", 25, "White Choco");
		Chocolate c3 = new Chocolate("FiveStar", 15, "Caramel Choco");
		Chocolate c4 = new Chocolate("KitKat", 30 , "DarkChoco");
		
		ArrayList<Chocolate> choAL = new ArrayList<Chocolate>();
		choAL.add(c1);
		choAL.add(c2);
		
		PriorityQueue<Chocolate> choQ = new PriorityQueue<Chocolate>();
		choQ.add(c3);
		choQ.offer(c4);
		choQ.addAll(choAL);
		
		System.out.println("Displaying elements");
		System.out.println(choQ);
		System.out.println("------------------");
		
		System.out.println("Traversing elements");
		Iterator<Chocolate> choItr = choQ.iterator();
		while(choItr.hasNext()) {
			System.out.println(choItr.next());
		}
		
		System.out.println("First element: "+choQ.peek());
		System.out.println("----------------------------");
		
		System.out.println("Removing 1st element: "+choQ.poll());
		System.out.println(choQ);
		System.out.println("----------------------------");
		
		System.out.println("Displaying 1st element: "+choQ.element());//if queue is empty it gives NoSuchElementException
		System.out.println("----------------------------");
		
		System.out.println("Removing 1st element: ");
		System.out.println(choQ.remove());//doesnt display the 1st element like poll, only removes it
		System.out.println(choQ);
		System.out.println("----------------------------");
		
		
	}

}
