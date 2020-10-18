package com.xworkz.interfaceconcept.assignment;

public class BoxTester {

	public static void main(String[] args) {
		
		System.out.println("Child class");
		GeometryBox geometryBox = new GeometryBox();
		geometryBox.brand="Camlin";
		geometryBox.price=80;
		geometryBox.open();
		geometryBox.storing();
		geometryBox.close();
		geometryBox.listOfItems();
		geometryBox.displayDetails();

		System.out.println("===================================");
		System.out.println("Upcasting");
		MetalBox metalBox = new GeometryBox();
		metalBox.open();
		metalBox.storing();
		metalBox.close();
		metalBox.listOfItems();
		metalBox.displayDetails();	
		
	}

}
