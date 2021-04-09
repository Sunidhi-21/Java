package com.xworkz.map.hashmap;

import java.util.HashMap;

public class TraineeTester {
	
	public static void main(String[] args) {
		
		HashMap<Trainee, Integer> trHashmap = new HashMap<Trainee, Integer>();
		Trainee t1 = new Trainee("Sunidhi", 12, "Java");
		Trainee t2 = new Trainee("Sneha", 98, "Sql");
		Trainee t3 = new Trainee("Sumana", 76, "Web technologies");
		Trainee t4 = new Trainee("Sharadhi", 11, "Python");
		trHashmap.put(t1, 30);
		trHashmap.put(t2, 5);
		trHashmap.put(t3, 6);
		trHashmap.put(t4, 0);
		
		System.out.println(trHashmap);
	}
}
