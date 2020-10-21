package com.xworkz.MultipleInheritance.assignment;

public class MessageTester {

	public static void main(String[] args) {
		
		Message message = new Message();
		message.msg();
		
		A a = new Message();
		a.msg();
		
		B b = new Message();
		b.msg();
	}

}
