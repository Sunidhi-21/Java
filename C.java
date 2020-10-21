package com.xworkz.MultipleInheritance.assignment;

public interface C extends A,B {

	@Override
	default void msg() {
		A.super.msg();
		B.super.msg();
	}

	
}
