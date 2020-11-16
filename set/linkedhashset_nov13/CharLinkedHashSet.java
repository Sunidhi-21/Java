package com.xworkz.collections.set.linkedhashset_nov13;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CharLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Character> chLHS = new LinkedHashSet<Character>();
		
		chLHS.add('q');
		chLHS.add('r');
		chLHS.add('a');
		chLHS.add('b');
		chLHS.add('c');
		
		System.out.println("Traversing using forEach");
		chLHS.forEach((n)->System.out.println(n));
		System.out.println("--------------------");
		
		System.out.println("Traversing using iterator");
		Iterator<Character> chItr = chLHS.iterator();
		while(chItr.hasNext()) {
			System.out.println(chItr.next());
		}
	}
}
