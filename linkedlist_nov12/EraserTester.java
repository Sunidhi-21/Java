package com.xworkz.collections.linkedlist_nov12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EraserTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Eraser> eraLL = new LinkedList<Eraser>();
		
		Eraser er1 = new Eraser("Apsara",5.00,4);
		Eraser er2 = new Eraser("Camlin",6.00,5);
		Eraser er3 = new Eraser("Doms",4.00,3);
		Eraser er4 = new Eraser("Faber Castle",15.00,8);
		
		eraLL.addLast(er4);
		eraLL.addFirst(er2);
		eraLL.add(er1);
		eraLL.offer(er3);
		
		System.out.println(eraLL.addAll(eraLL));
		System.out.println("---------------------------");
		System.out.println(eraLL);
		System.out.println("---------------------------");
		
		Iterator<Eraser> eraItr = eraLL.iterator();
		while(eraItr.hasNext()) {
			System.out.println(eraItr.next());
		}
		System.out.println("---------------------------");
		
		ListIterator<Eraser> eraLItr = eraLL.listIterator();
		while(eraLItr.hasNext()) {
			System.out.println(eraLItr.next());
		}System.out.println("---------------------------");
		
		System.out.println("Displaying 1st element: "+eraLL.peek());
		System.out.println("---------------------------");
		System.out.println("Displaying 1st element: "+eraLL.getFirst());
		System.out.println("---------------------------");
		System.out.println("Displaying last element: "+eraLL.getLast());
		System.out.println("---------------------------");
		System.out.println("Displaying 1st element: "+eraLL.element());
		
		//remove, removeall, poll, pollfirst,polllast, pop, push etc.
		
		System.out.println("--------------------------");
		System.out.println(eraLL.remove());
		System.out.println("--------------------------");
		System.out.println(eraLL.poll());
		System.out.println(eraLL);
		System.out.println("---------------------------");
		System.out.println(eraLL.pollFirst());
		System.out.println("---------------------------");
		System.out.println(eraLL.pollLast());
		System.out.println("---------------------------");
		System.out.println(eraLL);
		System.out.println(eraLL.pop());
		System.out.println("---------------------------");
		//eraLL.push();
		System.out.println(eraLL);
		System.out.println("---------------------------");
		eraLL.removeAll(eraLL);
		System.out.println(eraLL);
			
	}

}
