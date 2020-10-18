package com.xworkz.interfaceconcept.assignment;

public class SoapTester {

	public static void main(String[] args) {
		
		System.out.println("Child class");
		LiquidBathingSoap liquidBathingSoap = new LiquidBathingSoap() ;
		liquidBathingSoap.brand="Pears";
		liquidBathingSoap.price=80;
		liquidBathingSoap.color="green";
		liquidBathingSoap.washing();
		liquidBathingSoap.lathering();
		liquidBathingSoap.texture();
		liquidBathingSoap.displayDetails();
	      		
		System.out.println("Parent class");
		BathingSoap bathingSoap = new LiquidBathingSoap();
		bathingSoap.brand="Dettol";
		bathingSoap.price=45;
		bathingSoap.displayDetails();
		
	}

}
