package com.xworkz.arrays.arraysassignment;

public class PenPencilArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PenPencil[] ppArray = new PenPencil[3];
		String[] brand = new String[3];
		double[] size = new double[3];
		int[] price = new int[3];
		
		{
			PenPencil camlin = new PenPencil("Camlin",0.5,15);
			brand[0]=camlin.getBrand();
			size[0]=camlin.getSize();
			price[0]=camlin.getPrice();
			ppArray[0]=camlin;
		}
		
		{
			PenPencil faberCastle = new PenPencil("Faber Castle",0.7,25);
			faberCastle.setBrand("Faber Castle");
			brand[1]=faberCastle.getBrand();
			
			faberCastle.setSize(0.9);
			size[1]=faberCastle.getSize();
			
			faberCastle.setPrice(20);
			price[1]=faberCastle.getPrice();
			ppArray[1]=faberCastle;
		}
		
		{
			PenPencil doms = new PenPencil("Doms",0.9,20);
			brand[2]=doms.getBrand();
			size[2]=doms.getSize();
			price[2]=doms.getPrice();
			ppArray[2]=doms;
		}
		
		System.out.println("Pen pencil brands: ");
		for(int i=0;i<brand.length;i++) {
			System.out.println("brand: "+brand[i]);
		}
		
		System.out.println("Pen pencil colors: ");
		for(int i=0;i<size.length;i++) {
			System.out.println("size: "+size[i]);
		}
		
		System.out.println("Pen pencil prices: ");
		for(int i=0;i<price.length;i++) {
			System.out.println("price: "+price[i]);
		}
		
		System.out.println("all pen pencil details: ");
		for(int i=0;i<ppArray.length;i++) {
			PenPencil pp = ppArray[i];
			pp.displayDetails();
			pp.insertLead();
			pp.clicking();
			pp.writing();
			pp.removelead();
		}	
		
		System.out.println("all pen pencil details using for each loop");
		for(PenPencil pp : ppArray ) {
			pp.displayDetails();
			pp.insertLead();
			pp.clicking();
			pp.writing();
			pp.removelead();
		}

	}

}
