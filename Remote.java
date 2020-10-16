package com.xworkz.abstraction.assignment;

public abstract class Remote {

	int buttons;
	int size;
	
	abstract void operations();
	abstract void volume();
	abstract void changingChannel();
	
	void mainPurpose() {
		System.out.println("turn on/off the device");
	}
	
	void displayDetails() {
		System.out.println("button: "+buttons+" | "+"Size: "+size);
	}


}
