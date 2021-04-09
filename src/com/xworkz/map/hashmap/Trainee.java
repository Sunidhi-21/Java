package com.xworkz.map.hashmap;

public class Trainee {

	private String name;
	private int tId;
	private String course;
	
	public Trainee(String name, int tId, String course) {
		super();
		this.name = name;
		this.tId = tId;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", tId=" + tId + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (tId != other.tId)
			return false;
		return true;
	}

	

	
	
}
