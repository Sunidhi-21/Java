package com.xworkz.blockz;

public class Clock {
	
	String brand;
	boolean isAnalog;
	String shape;

	{
		System.out.println("we are in init block");
		brand = "timex";
	}
	{
		System.out.println("we are in 2nd init block");
		isAnalog = true;
	}
	
	Clock(){
		System.out.println("defailt constructor");
	}
	
	Clock(String inBrand , boolean inAnalog,String inShape){
		brand = inBrand;
		isAnalog = inAnalog;
		shape = inShape;
	}
	
	{
		System.out.println("we are in 3rd init block");
		showTime();
	}
	{
		System.out.println("we are in 4th init block");
		shape = "round";
	}
	public void showTime() {
		System.out.println("brand "+brand+" analog: "+isAnalog);
	}
	
}

