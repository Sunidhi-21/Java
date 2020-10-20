package com.xworkz.accsessmodifiersbasedoverriding.pack2;

import com.xworkz.accsessmodifiersbasedoverriding.TalcumPowder;

public class TalcumPowderTester {

	public static void main(String[] args) {
		
		TalcumPowder talcumPowder = new TalcumPowder();
		
		talcumPowder.fragrance();
		//talcumPowder.type();//cant access default and protected methods outside the parent package 
		//talcumPowder.netWeight();
		
		//talcumPowder.price(); cant access private method outside the class
	
		FaceTalc faceTalc = new FaceTalc();
		faceTalc.fragrance();
		//faceTalc.type();
		faceTalc.netWeight();//child class method
		faceTalc.accessPrice();//can access method calling private method outside class outside package
		
		
		TalcumPowder whiteTone = new FaceTalc();//upcasting 
		whiteTone.fragrance();//child class method
		//ponds.netWeight(); //cant access protected methods of parent class or child class 
		                     //using parent class object outside parent package in upcasting
		whiteTone.accessPrice();//can access method calling private method outside class outside package
		//ponds.type();
		//pinds.netWeight();
		
		//ponds.price(); cant access private method outside the class

	}

}






//can access BodyTalc class if class is imported 
//BodyTalc bodyTalc = new BodyTalc();
//
//bodyTalc.fragrance();
//bodyTalc.type();
//bodyTalc.netWeight();
//
////bodyTalc.price(); cant access private method outside the class
//
//TalcumPowder talcumPowder = new TalcumPowder();
//
//talcumPowder.fragrance();
//talcumPowder.type();
//talcumPowder.netWeight();
//
////talcumPowder.price(); cant access private method outside the class
//
//TalcumPowder ponds = new BodyTalc();//upcasting child method is called
//ponds.fragrance();
//ponds.type();
//ponds.netWeight();
//
////ponds.price(); cant access private method outside the class
