package com.xworkz.arrays.arraysassignment;

public class InstantNoodlesArray {

	public static void main(String[] args) {
		
		InstantNoodles[] noodleArray = new InstantNoodles[4];
		
		InstantNoodles maggi = new InstantNoodles();
		maggi.brand="Maggi";
		maggi.flavour="Indian Masala";
		maggi.price=12;
		
		noodleArray[0] = maggi;
		
		InstantNoodles yippee = new InstantNoodles();
		yippee.brand="Yippee";
		yippee.flavour="Mood Masala";
		yippee.price=12;
		
		noodleArray[1] = yippee;
		
		InstantNoodles chings = new InstantNoodles();
		chings.brand="Chings";
		chings.flavour="Manchurian";
		chings.price=15;
		
		noodleArray[2] = chings;
		
		for(int i=0;i<noodleArray.length;i++) {
			if(noodleArray[i]!=null) {
				InstantNoodles inn = noodleArray[i];
				inn.displayDetails();
			}
		}
		
		System.out.println("Printing using for each: ");
		for(InstantNoodles inn : noodleArray) {
			if(inn!=null)
				inn.displayDetails();
		}
	}
}
