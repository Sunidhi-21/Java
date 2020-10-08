package com.xworkz.excepionhandling.assignment;

public class HandBagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HandBag[] bagArray = new HandBag[3];
		
		HandBag lavie = new HandBag("Lavie","red",1700);
		bagArray[0]=lavie;
		
		HandBag baggit = new HandBag("Baggit","green",1500);
		bagArray[1]=baggit;
		
		System.out.println("all handbag details: ");
		
		try {
			
			for(int i=0;i<bagArray.length;i++) {
				HandBag hb = bagArray[i];
				hb.displayDetails();
				hb.opening();
				hb.closing();
				hb.storing();
				System.out.println("--------------------------");
			}
		}catch(NullPointerException ne) {
			System.out.println("null");
		}
		
		
		System.out.println();
		System.out.println("all handbag details using for each");
	
		try { 
			
			for(HandBag hb : bagArray ) {
				hb.displayDetails();
				hb.opening();
				hb.closing();
				hb.storing();
				System.out.println("--------------------------");
			}
		}catch(NullPointerException ne) {
				System.out.println("null");
			}
	}
}

