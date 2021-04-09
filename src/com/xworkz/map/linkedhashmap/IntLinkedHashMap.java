package com.xworkz.map.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class IntLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> appointment = new LinkedHashMap<Integer, String>();
		
		appointment.put(2, "Sampada"); //diff key same value accepted
		appointment.put(3, "Sampada"); 
		appointment.put(6, "anika");//same key diff values not accepted
		appointment.put(6, "chandana");
		appointment.put(10, null );//more than 1 null values accepted
		appointment.put(11,null);
		appointment.put(null, "kavya");//more than 1 null keys not accepted
		appointment.put(null, "kaya");
		
		
		LinkedHashMap<Integer, String> appointment1 = new LinkedHashMap<Integer, String>();
		appointment1.put(1,"Sunidhi");
		
		
		appointment.putIfAbsent(0, "poorvi");//adds the element if absent
		appointment.putAll(appointment1);//Copies all of the mappings from the specified map to this map
		appointment.replace(3, "n");//replaces the original value of the key with the given value
		appointment.replace(6, "chandana", "oo");
		
		System.out.println(appointment.keySet());//Returns a Set view of the keys contained in this map.
		System.out.println(appointment.entrySet());//Returns a Set view of the mappings contained in this maps
		System.out.println(appointment.equals(appointment));//Compares the specified object with this map for equality
		System.out.println(appointment.get(3));//returns value of the given key of present else null
		System.out.println(appointment.size());//Returns the number of key-value mappings in this map.
		
		System.out.println(appointment.containsValue("Sampada"));//boolean true or false if present/absent
		System.out.println(appointment.containsKey(3));
		System.out.println(appointment.remove(6));//returns the value of the given key and removes the element
		System.out.println(appointment.remove(null, "kaya"));//returns true if element removed else false
		System.out.println(appointment);//sorted map in insertion order.
		
		Set<Integer> k = appointment.keySet();
		
		for(Integer i : k)
			System.out.println("key: "+i+"value: "+appointment.get(i));
			
		Collection<String> val = appointment.values();
		for(String i : val)
			System.out.println(i);
	}

}
