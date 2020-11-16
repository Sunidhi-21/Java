package com.xworkz.collections.set.treeset_nov13;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class IronBoxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<IronBox> ibComp = (o1,o2)->o1.getPrice()-o2.getPrice();
		
		TreeSet<IronBox> ibTS = new TreeSet<IronBox>(ibComp);
		
		IronBox ib1 = new IronBox("Bajaj", 770, 1000,"Dry iron");
		IronBox ib2 = new IronBox("Philips", 4600, 2400,"Steam iron");
		IronBox ib3 = new IronBox("Philips", 1500, 1440,"Steam iron");
		IronBox ib4 = new IronBox("Crompton", 535, 750,"Dry iron");
		
		ibTS.add(ib1);
		ibTS.add(ib2);
		ibTS.add(ib3);
		ibTS.add(ib4);
		
		System.out.println(ibTS);
		System.out.println("--------------------");
		
		System.out.println("Traversing using forEach");
		ibTS.forEach((n)->System.out.println(n));
		System.out.println("--------------------");
		
		System.out.println("Traversing using iterator");
		Iterator<IronBox> ibItr = ibTS.iterator();
		while(ibItr.hasNext()) {
			System.out.println(ibItr.next());
		}
		
		System.out.println("----------------------");
		System.out.println(ibTS.first());
		
		System.out.println("----------------------");
		ibTS.clear();//Removes all of the elements from this set.
		System.out.println(ibTS);
		
	}

}
