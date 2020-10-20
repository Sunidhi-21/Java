package com.xworkz.accsessmodifiersbasedoverriding;

public class BodyTalc extends TalcumPowder {
	

	@Override
	public void fragrance() {
		System.out.println("Dreamflower");
	}

	@Override
	void type() {
		System.out.println("Body talc");
	}

	@Override
	protected void netWeight() {
		System.out.println("net wt: " +netWt);
	}
	
//	@Override 
//	public void accessPrice() { 
//		price();
//	}
	//cannot override the private methods called in other methods of parent class 

//	@Override
//	private void price() {
//		System.out.println("price: "+price);
//	}
	// cannot override private methods	

}
