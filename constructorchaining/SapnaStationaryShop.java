package com.xworkz.constructorchaining;

public class SapnaStationaryShop implements StationaryShop {
	
	String books;
	int priceOfBooks;
	String pens;
	int priceOfPens;
	String pencils;
	int priceOfPencils;
	String color;
	
	public SapnaStationaryShop() {
		this("red");
	}
	
	public SapnaStationaryShop(String color) {
		this(50,10,5);
		this.color = color;
		System.out.println("Color: "+color);
		
	}
	
	public SapnaStationaryShop(int priceOfBooks, int priceOfPens, int priceOfPencils) {
		this("classmate","rorito","doms");
		this.priceOfBooks = priceOfBooks;
		this.priceOfPens = priceOfPens;
		this.priceOfPencils = priceOfPencils;
		System.out.println("priceOfBooks: "+priceOfBooks+" | "+"priceOfPens: "+priceOfPens+" | "+"priceOfPencils: "+priceOfPencils);
	}
	
	public SapnaStationaryShop(String books, String pens, String pencils) {
		System.out.println("List of items");
		this.books = books;
		this.pens = pens;
		this.pencils = pencils;
		System.out.println("books: "+books+" | "+"pens: "+pens+" | "+"pencils: "+pencils);
	}
	
	
	
	
	@Override
	public void books() {
		System.out.println("3 books");
		
	}

	@Override
	public void pens() {
		System.out.println("2 pens");
		
	}

	@Override
	public void pencils() {
		System.out.println("1 pencil");
		
	}
		
}
	
//	String books;
//	int priceOfBooks;
//	String pens;
//	int priceOfPens;
//	String pencils;
//	int priceOfPencils;
//	
//	public SapnaStationaryShop() {
//		System.out.println("Brands ");
//	}
//	
//	public SapnaStationaryShop(String books, String pens, String pencils) {
//		this();
//		this.books = books;
//		this.pens = pens;
//		this.pencils = pencils;
//		System.out.println("books: "+books+" | "+"pens: "+pens+" | "+"pencils: "+pencils);
//	}
//
//	public SapnaStationaryShop(int priceOfBooks, int priceOfPens, int priceOfPencils) {
//		this("classmate","rorito","doms");
//		this.priceOfBooks = priceOfBooks;
//		this.priceOfPens = priceOfPens;
//		this.priceOfPencils = priceOfPencils;
//		System.out.println("priceOfBooks: "+priceOfBooks+" | "+"priceOfPens: "+priceOfPens+" | "+"priceOfPencils: "+priceOfPencils);
//	}
	
	
	

