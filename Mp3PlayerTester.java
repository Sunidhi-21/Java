package com.xworkz.upcastingdowncasting.assignment;

public class Mp3PlayerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Instance of child class");
		BluetoothMp3Player bluetoothMp3Player = new BluetoothMp3Player("BT",2);
		
		bluetoothMp3Player.setBrand("iPod");
		bluetoothMp3Player.setPrice("$257");
		System.out.println("displaying details using constructor");
		bluetoothMp3Player.displayDetails();
		System.out.println();
		
		bluetoothMp3Player.setType("bluetooth");
		bluetoothMp3Player.setMemoryInGb(2);
		
		System.out.println("Brand: "+bluetoothMp3Player.getBrand());
		System.out.println("Price: "+bluetoothMp3Player.getPrice());
		System.out.println("Type: "+bluetoothMp3Player.getType());
		System.out.println("MemoryInGb: "+bluetoothMp3Player.getMemoryInGb());
		bluetoothMp3Player.playSongs();
		bluetoothMp3Player.bluetoothConnectivity();
		System.out.println();
		System.out.println("displaying details using getter setter");
		bluetoothMp3Player.displayDetails();
		
		System.out.println();
		System.out.println("==================================================");
		System.out.println("Instance of parent class");
		Mp3Player mp3Player = new Mp3Player("Sony","5000rs");
		
		System.out.println("displaying details using constructor");
		mp3Player.displayDetails();
		System.out.println();
		
		mp3Player.setBrand("Sony");
		mp3Player.setPrice("5000rs");
		System.out.println("brand: "+mp3Player.getBrand());
		System.out.println("price: "+mp3Player.getPrice());
		mp3Player.playSongs();
		mp3Player.bluetoothConnectivity();
		System.out.println();
		System.out.println("displaying details using getter setter");
		mp3Player.displayDetails();	
		
	}

}
