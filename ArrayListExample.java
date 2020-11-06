package com.xworkz.collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList al = new ArrayList<>();// creating arraylist
	
			al.add("Sunidhi");
			al.add(1);
			al.add(true);
			al.add(60.00);
			al.add(null);
	
			System.out.println("displaying values");
			System.out.println(al); // .tostring is overridden to display elements
			System.out.println("-------------------------");
	
			System.out.println("Checking size");
			System.out.println(al.size());
			System.out.println("-------------------------");
	
			System.out.println("Checking if the al is empty");
			System.out.println(al.isEmpty());
			System.out.println("-------------------------");
	
			System.out.println("searching an element");
			System.out.println(al.contains("Sunidhi"));
			System.out.println("-------------------------");
	
			System.out.println("removing an element");
			System.out.println(al.remove(60.00));
			System.out.println(al);

		}

}


