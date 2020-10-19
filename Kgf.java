package com.xworkz.interfaceconcept.assignment;

public class Kgf extends KannadaMovie {

	public void watching() {
		// TODO Auto-generated method stub
		System.out.println("watch kgf movie");
	}

	public void actors() {
		// TODO Auto-generated method stub
		System.out.println("Kgf actors");
	}

	@Override
	public void buyTicket() {
		// TODO Auto-generated method stub
		System.out.println("buy kgf movie ticket");
	}

	void displayDetails() {
		System.out.println("Name: " + name + "Actor: " + actor);
	}
}
