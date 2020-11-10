package com.xworkz.collections.arraylist.nov10;

import java.util.ArrayList;

import java.util.Comparator;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> stuAL = new ArrayList<Student>();

		Student s1 = new Student(16, "Rohan", "J P nagar");
		Student s2 = new Student(16, "Rahul", "RR nagar");
		Student s3 = new Student(18, "Reka", "RajajiNagar");
		Student s4 = new Student(14, "Ruhi", "Jayanagar");

		stuAL.add(s1);
		stuAL.add(s2);
		stuAL.add(s3);
		stuAL.add(s4);

		Comparator<Student> comparator1 = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Comparator<Student> comparator2 = (o1, o2) -> o1.getAge() - o2.getAge();

		stuAL.sort(comparator1);
		System.out.println("Sorting w.r.t name");
		System.out.println(stuAL);
		stuAL.sort(comparator2);
		System.out.println("Sorting w.r.t age");
		System.out.println(stuAL);

	}
}
