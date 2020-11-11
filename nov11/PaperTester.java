package com.xworkz.collections.queue.nov11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PaperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paper p1 = new Paper("A4",1.1,"ruled");
		Paper p2 = new Paper("A3",1.2,"Unruled");
		Paper p3 = new Paper("A4",1.3,"Unruled");
		Paper p4 = new Paper("A3",1.4,"ruled");
		Paper p5 = new Paper("A5",1.11,"Unruled");
		Paper p6 = new Paper("A5",2.0,"ruled single side");
		
		ArrayList<Paper> cuAl = new ArrayList<Paper>();
		cuAl.add(p1);
		cuAl.add(p2);
		
		Comparator<Paper> sorter = Comparator.comparing(Paper::getThickness);
		PriorityQueue<Paper> cuQ = new PriorityQueue<Paper>(sorter);
		
		cuQ.add(p3);
		cuQ.add(p4);
		cuQ.add(p5);
		cuQ.offer(p6);
		cuQ.addAll(cuAl);
		
		System.out.println("Displaying elements");
		System.out.println(cuQ);
		System.out.println("----------------------------");
		
		System.out.println("Traversing elements");
		Iterator<Paper> cuItr = cuQ.iterator();
		
		while(cuItr.hasNext()) {
			System.out.println(cuItr.next());
		}
		System.out.println("----------------------------");
		
		System.out.println("First element: "+cuQ.peek());
		System.out.println("----------------------------");
		
		System.out.println("Removing 1st element: "+cuQ.poll());
		System.out.println(cuQ);
		System.out.println("----------------------------");
		
		System.out.println("Displaying 1st element: "+cuQ.element());//if queue is empty it gives NoSuchElementException
		System.out.println("----------------------------");
		
		System.out.println("Removing 1st element: ");
		System.out.println(cuQ.remove());//doesnt display the 1st element like poll, only removes it
		System.out.println(cuQ);
		System.out.println("----------------------------");
	}

}
