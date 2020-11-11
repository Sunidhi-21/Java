package com.xworkz.collections.queue.nov11;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DoublePriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> doAl = new ArrayList<Double>();
		doAl.add(9.00);
		doAl.add(2.00);
		
		PriorityQueue<Double> doQ = new PriorityQueue<Double>();
		doQ.add(8.00);
		doQ.add(7.00);
		doQ.add(9.10);
		doQ.offer(9.23);
		doQ.addAll(doAl);
		
		System.out.println("Displaying elements");
		System.out.println(doQ);
		System.out.println("----------------------------");
		
		System.out.println("Traversing PQ using forEach:");
		doQ.forEach((n)->System.out.println(n));
		System.out.println("----------------------------");
		
		System.out.println("First element: "+doQ.peek());
		System.out.println("----------------------------");
		
		System.out.println("Removing 1st element: "+doQ.poll());
		System.out.println(doQ);
		System.out.println("----------------------------");
		
		System.out.println("displaying 1st element");
		System.out.println(doQ.element());
		System.out.println("----------------------------");//if queue is empty it gives NoSuchElementException
		
		System.out.println("Removing 1st element: ");
		doQ.remove();//doesnt display the 1st element like poll, only removes it
		System.out.println(doQ);
	}

}
