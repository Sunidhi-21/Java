package com.xworkz.abstraction.assignment;

public class TvRemote extends Remote {
	
	String brand;
	String type;

	@Override
	 void operations() {
		System.out.println("switch on/off the tv,change channel,increase/decrease volume,mute,etc..");
	}
	
	@Override
	 void volume() {
		System.out.println("increase or decrease volume by using arrow buttons");
	}
	
	@Override
	 void changingChannel() {
		System.out.println("changing channel using arrow buttons or by typing channel no.");
	}
	
	@Override
	void displayDetails() {
		System.out.println("button: "+buttons+" | "+"Size: "+size+" | "+"brand: "+brand+" | "+"type: "+type);
	}
	
	
}
