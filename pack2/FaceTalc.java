package com.xworkz.accsessmodifiersbasedoverriding.pack2;

import com.xworkz.accsessmodifiersbasedoverriding.TalcumPowder;

public class FaceTalc extends TalcumPowder {

	int netWt = 100;
	
	@Override
	protected void netWeight() {
		System.out.println("net weight: "+netWt);
	}
	
//	@Override//default method in TalcumPowder
//	void type() {     
//		System.out.println();
//	}
	//CompileTimeError: // The method FaceTalc.type() does not override the inherited method 
		//from TalcumPowder since it is private to a different package
		
	@Override 
	public void fragrance() {
		System.out.println("Sunflower");
	}
	
//	@Override //cant override private methods present in parent class
//	private void price() {
//		System.out.println();
//	}
	
}
