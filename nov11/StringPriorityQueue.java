package com.xworkz.collections.queue.nov11;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class StringPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strAl = new ArrayList<String>();
		strAl.add("Preethi");
		strAl.add("Priya");
		
		PriorityQueue<String> strQ = new PriorityQueue<String>();
		strQ.add("Sunidhi");
		strQ.add("Preethi");
		strQ.add("Priya");
		strQ.offer("Poorvi");
		strQ.addAll(strAl);
		
		System.out.println("Displaying elements");
		System.out.println(strQ);
		System.out.println("----------------------------");
		
		System.out.println("Traversing PQ using forEach");
		strQ.forEach((n)->System.out.println(n));
		System.out.println("----------------------------");
		
		System.out.println("First element: "+strQ.peek());
		System.out.println("----------------------------");
		
		System.out.println("Removing 1st element: "+strQ.poll());
		System.out.println(strQ);
		System.out.println("----------------------------");
		
		System.out.println("Displaying 1st element");
		System.out.println(strQ.element());
		System.out.println("----------------------------");//if queue is empty it gives NoSuchElementException
		
		System.out.println("Removing 1st element: ");
		strQ.remove();//doesnt display the 1st element like poll, only removes it
		System.out.println(strQ);
		
	}

}
