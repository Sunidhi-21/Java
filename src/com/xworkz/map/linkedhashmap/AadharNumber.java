package com.xworkz.map.linkedhashmap;

import java.util.LinkedHashMap;

public class AadharNumber {
	
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> aadhar = new LinkedHashMap<Integer, String>();
		
		aadhar.put(265752792, "Sampada"); //diff key same value accepted
		aadhar.put(475972709, "Sampada"); 
		aadhar.put(764818591, "anika");//same key diff values not accepted
		aadhar.put(237647619, "chandana");
		aadhar.put(834787178, "anita" );//more than 1 null values accepted
		aadhar.put(743858178, "sunita");
		aadhar.put(247827877, "kavya");//more than 1 null keys not accepted
		aadhar.put(178787897, "remya");
		
		System.out.println(aadhar.keySet());
	
	}
}