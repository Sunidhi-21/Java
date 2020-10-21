package com.xworkz.MultipleInheritance.assignment;

public class Reptiles implements Snake,Crocodile {

	@Override
	public void movement() {
		System.out.println("Movement of snake");
		Snake.super.movement();
		System.out.println("Movement of crocodile");
		Crocodile.super.movement();
	}
	
}
