package com.xworkz.map.hashmap;

import java.util.HashMap;

public class IntHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> appointment = new HashMap<Integer, String>();
		appointment.put(2, "Sampada"); //diff key same value accepted
		appointment.put(3, "Sampada"); 
		appointment.put(6, "anika");//same key diff values not accepted
		appointment.put(6, "chandana");
		appointment.put(10, null );//more than 1 null values accepted
		appointment.put(11,null);
		appointment.put(null, "kavya");//more than 1 null keys not accepted
		appointment.put(null, "kaya");
		System.out.println(appointment);
	}

}
