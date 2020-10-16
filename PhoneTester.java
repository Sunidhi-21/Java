package com.xworkz.abstraction.assignment;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone smartPhone = new SmartPhone();
		smartPhone.brand="Oppo F15";
		smartPhone.color="Opal black";
		smartPhone.ram = 8;
		smartPhone.rom = 128;
		smartPhone.network="4G";
		smartPhone.camPix = "48MP";
		
		smartPhone.primaryFunction();
		smartPhone.calling();
		smartPhone.photos();
		smartPhone.message();
		smartPhone.displayDetails();
		
		System.out.println("===================================");
		Phone phone = new SmartPhone();//upcasting
		phone.brand="Oppo";
		phone.color="Black";
		phone.primaryFunction();
		phone.displayDetails();
		
	}

}
