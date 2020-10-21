package com.xworkz.MultipleInheritance.assignment;

public class Mammals implements Whale, Elephant {

	@Override
	public void habitat() {
		System.out.println("elephant lives on land.Whale lives in water");
	}

	@Override
	public void noOfFeet() {
		System.out.println("Elephant has 4 feet.Whale has none");
		
	}

	@Override
	public void food() {
		System.out.println("Whale is Carnivore.Elephant is herbivore");
		
	}

}
