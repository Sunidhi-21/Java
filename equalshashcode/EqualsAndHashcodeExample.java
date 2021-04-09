package com.xworkz.equalshashcode;

import java.util.HashSet;

public class EqualsAndHashcodeExample {

	public static void main(String[] args) {
		
		HashSet<Student> stdHashset = new HashSet<Student>() ;
		Student s1 = new Student("Sunidhi", 22,123456789);
		Student s2 = new Student("Sunidhi", 22,123456789);
		stdHashset.add(s1);
		stdHashset.add(s2);
		
		System.out.println(stdHashset);
	}

}
