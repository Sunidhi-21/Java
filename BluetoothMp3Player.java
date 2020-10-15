package com.xworkz.upcastingdowncasting.assignment;

public class BluetoothMp3Player extends Mp3Player {
	
	public String type;
	private int memoryInGb;
	
	public BluetoothMp3Player() {
		
	}
	
	public BluetoothMp3Player(String type,int memory) {
		super();
		this.type = type;
		this.memoryInGb = memory;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMemoryInGb() {
		return memoryInGb;
	}

	public void setMemoryInGb(int memoryInGb) {
		this.memoryInGb = memoryInGb;
	}

	@Override
	public void playSongs() {
		System.out.println("playing songs with bluetooth head set as well as wired head set");
	}
	
	@Override
	public void bluetoothConnectivity() {
		System.out.println("has bluetooth connectivity");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("brand: "+getBrand()+" | "+"price: "+getPrice()+" | "+"type: "+type+" | "+"memoryInGb: "+memoryInGb);
	}
	
	
}
