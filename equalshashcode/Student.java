package com.xworkz.equalshashcode;

public class Student {

	private String name;
	private int age;
	private long id;
	
	public Student(String name, int age, long id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
