package com.xworkz.map.treemap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Months {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> months = new TreeMap<String, Integer>();
		
		months.put("January", 31);
		months.put("Febrauary", 28);
		months.put("March", 30);
		months.put("April", 31);
		months.put("May", 30);
		months.put("June", 31);
		months.put("July", 30);
		months.put("August", 31);
		months.put("September", 30);
		months.put("October", 31);
		months.put("November", 30);
		months.put("December", 31);
		
		Set<Entry<String, Integer>> entry = months.entrySet();
		
		for(Entry<String,Integer> e : entry) {
			System.out.println("Key: "+e.getKey() +" | Vlue: "+e.getValue());
		}
	}
	
	
}
