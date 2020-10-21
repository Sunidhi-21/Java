package com.xworkz.MultipleInheritance.assignment;

public class MammalsTester {

	public static void main(String[] args) {
		
		Mammals mammals = new Mammals();
		
		mammals.habitat();
		mammals.food();
		mammals.noOfFeet();
		
		Whale whale = new Mammals();
		whale.habitat();
		
		Elephant elephant = new Mammals();
		elephant.habitat();

	}

}
