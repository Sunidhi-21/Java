package com.xworkz.blockz;

public class InitialisationBlock {

	int x =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start prog");
		Clock timexClock = new Clock("quartz",true,"round");
		System.out.println("brand: "+timexClock.brand+" analog "+timexClock.isAnalog+" shape "+timexClock.shape);
		System.out.println("end");
	}
	
}
