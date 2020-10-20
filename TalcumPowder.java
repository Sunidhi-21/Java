package com.xworkz.accsessmodifiersbasedoverriding;

public class TalcumPowder {

	int price = 100;
	
	protected int netWt = 400;
	
	public void fragrance() {
		System.out.println("Good fragrance");
	}

	void type() {
		System.out.println("anytype");
	}

	private void price() {
		System.out.println("price: "+price);
	}

	protected void netWeight() {
		System.out.println("net wt");
	}
	
	public void accessPrice() {
		price();
	}//can call the private method in other methods within same class
}
