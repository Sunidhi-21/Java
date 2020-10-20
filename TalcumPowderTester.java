package com.xworkz.accsessmodifiersbasedoverriding;

public class TalcumPowderTester {

	public static void main(String[] args) {
		
		BodyTalc bodyTalc = new BodyTalc();
				
		bodyTalc.fragrance();
		bodyTalc.type();
		bodyTalc.netWeight();
		bodyTalc.accessPrice();//can access method calling private method outside class
		
		//bodyTalc.price(); cant access private method outside the class
		
		TalcumPowder talcumPowder = new TalcumPowder();
		
		talcumPowder.fragrance();
		talcumPowder.type();
		talcumPowder.netWeight();
		talcumPowder.accessPrice();//can access method calling private method outside class
		
		//talcumPowder.price(); cant access private method outside the class
	
		TalcumPowder ponds = new BodyTalc();//upcasting 
		ponds.fragrance();
		ponds.type();
		ponds.netWeight();
		ponds.accessPrice();//can access method calling private method outside class
		
		//ponds.price(); cant access private method outside the class
		
	}

}
