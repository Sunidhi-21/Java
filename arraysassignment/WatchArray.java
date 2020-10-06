package com.xworkz.arrays.arraysassignment;

public class WatchArray {

	public static void main(String[] args) {
		
		Watch[] watchArray = new Watch[3];
		
		Watch titan = new Watch();
		titan.brand="Titan";
		titan.digital=false;
		titan.strap="Leather strap";
		
		watchArray[0]=titan;
		
		Watch fastrack = new Watch();
		fastrack.brand="Fastrack";
		fastrack.digital=true;
		fastrack.strap="Rubber strap";
		
		watchArray[1]=fastrack;
		
		Watch rolex = new Watch();
		rolex.brand="Rolex";
		rolex.digital=true;
		rolex.strap="Metal strap";
		
		watchArray[2]=rolex;
		
		for(int i=0 ; i<watchArray.length ; i++) {
			if(watchArray[i]!=null) {
				Watch w = watchArray[i];
				w.printDetails();
			}
		}
		System.out.println("Print using for each");
		
		 for(Watch w : watchArray ) {
			 w.printDetails();
		 }
	}
}
