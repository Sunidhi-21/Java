package com.xworkz.upcastingdowncasting.assignment;

public class Mp3PlayerUpCastingDownCastingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Upcasting");
		Mp3Player mp3Player = new BluetoothMp3Player("BT",2);//upcasting
		mp3Player.setBrand("iPod");
		mp3Player.setPrice("$257");
		
		System.out.println("brand: "+mp3Player.getBrand());
		System.out.println("price: "+mp3Player.getPrice());
		mp3Player.displayDetails();
		
		System.out.println("==============================");
		System.out.println("DownCasting");
		
		BluetoothMp3Player bluetoothMp3Player = (BluetoothMp3Player) new Mp3Player();
		bluetoothMp3Player.setBrand("iPod");
		bluetoothMp3Player.setPrice("$257");
		bluetoothMp3Player.setMemoryInGb(2);
		bluetoothMp3Player.setType("Bluetooth");
		
		System.out.println("brand: "+bluetoothMp3Player.getBrand());
		System.out.println("price: "+bluetoothMp3Player.getPrice());
		System.out.println("type: "+bluetoothMp3Player.getType());
		System.out.println("memory: "+bluetoothMp3Player.getMemoryInGb());
		
		bluetoothMp3Player.displayDetails();
		
	}

}
