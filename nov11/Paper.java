package com.xworkz.collections.queue.nov11;

public class Paper {

	private String size;
	private double thickness;
	private String type;
	
	public Paper(String size, double thickness, String type) {
		super();
		this.size = size;
		this.thickness = thickness;
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Paper [size=" + size + ", thickness=" + thickness + ", type=" + type + "]";
	}

	
	
}
