package com.xworkz.MultipleInheritance.assignment;

public class OSTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidPhone androidPhone = new AndroidPhone();
		androidPhone.os();
		
		OS os = new OS();
		os.chooseMethod();
		
		AndroidPhone samsung = new OS();
		samsung.os();
		
		ApplePhone applePhone = new OS();
		applePhone.os();
		applePhone.model();
		
	}

}
