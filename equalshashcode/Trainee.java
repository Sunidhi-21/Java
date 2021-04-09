package com.xworkz.equalshashcode;

public class Trainee {

	private String trainee;
	private int numOfClass;
	
	public Trainee(String trainee, int numOfClass) {
		super();
		this.trainee = trainee;
		this.numOfClass = numOfClass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numOfClass;
		result = prime * result + ((trainee == null) ? 0 : trainee.hashCode());
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
		if (numOfClass != other.numOfClass)
			return false;
		if (trainee == null) {
			if (other.trainee != null)
				return false;
		} else if (!trainee.equals(other.trainee))
			return false;
		return true;
	}
	
	
}
