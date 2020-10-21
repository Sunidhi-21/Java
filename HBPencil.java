package com.xworkz.MultipleInheritance.assignment;

public class HBPencil extends Pencil {

	String darkness = "extra dark";
	String type = "hb pencil";
	
	public HBPencil() {
		System.out.println("darkness: "+darkness+"type: "+type);
	}
	
	public HBPencil(String darkness, String type) {
		this();
	}
	
	


}
