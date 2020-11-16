package com.xworkz.collections.linkedlist_nov12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StringLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> colors = new LinkedList<String>();
		
		colors.addLast("Purple");
		colors.addFirst("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Brown");
		colors.offer("Pink");
		System.out.println(colors);
		System.out.println("--------------------------");
		
		System.out.println("Traversimg using iterator");
		Iterator<String> colItr = colors.iterator();
		while(colItr.hasNext()) {
			System.out.println(colItr.next());
		}System.out.println("--------------------------");
		
		System.out.println("Traversing using list iterator");
		ListIterator<String> colLiItr = colors.listIterator();
		while(colLiItr.hasNext()) {
			System.out.println(colLiItr.next());
		}System.out.println("--------------------------");
		
		System.out.println("Displaying 1st element: "+colors.peek());
		System.out.println("--------------------------");
		System.out.println("Displaying 1st element: "+colors.getFirst());
		System.out.println("--------------------------");
		System.out.println("Displaying last element: "+colors.getLast());
		System.out.println("--------------------------");
		System.out.println("Displaying 1st element: "+colors.element());
		
		//remove, removeall, poll, pollfirst,polllast, pop, push etc.
		
		System.out.println("--------------------------");
		System.out.println(colors.remove());
		System.out.println("--------------------------");
		System.out.println(colors.poll());
		System.out.println("--------------------------");
		System.out.println(colors.pollFirst());
		System.out.println("--------------------------");
		System.out.println(colors.pollLast());
		System.out.println("--------------------------");
		System.out.println(colors.pop());
		System.out.println("--------------------------");
		colors.push("Mustard");
		System.out.println(colors);
		System.out.println("--------------------------");
		colors.removeAll(colors);
		System.out.println(colors);
		
	}

}
