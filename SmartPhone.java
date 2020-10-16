package com.xworkz.abstraction.assignment;

public class SmartPhone extends Phone {

	int ram;
	int rom;
	String network;
	String camPix;
	
	@Override
	void calling() {
		System.out.println("Voice over LTE(VoLTE) calling");
		System.out.println("audio and video calling");
	}

	@Override
	void photos() {
		System.out.println("Take high resolution pictures with high resollution smart phone camera");
	}

	@Override
	void message() {
		System.out.println("SMS and MMS,Online and Offine");
	}
	
	@Override
	void displayDetails() {
		System.out.println("brand: "+brand+" | "+"Color: "+color+" | "+"ram: "+ram+" | "+"rom: "+rom+" | "+"network: "+network+" | "+"campix: "+camPix);
	}

}
