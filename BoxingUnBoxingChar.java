package com.xworkz.wrapperclass.assignment;

public class BoxingUnBoxingChar {

	public static void main(String[] args) {
		
		//boxing
		System.out.println("boxing/wrapping");
		char a = 'a';
		Character c = new Character(a); 
		System.out.println("boxing by assigning char value to variable: "+c);
		Character d = new Character('x');
		System.out.println("boxing by giving char value directly: "+d);
		
		//autoboxing
		Character h = a;
		System.out.println("autoboxing by assigning char value to variable: "+h);
		Character ch = 'b';
		System.out.println("autoboxing by directly giving char value: "+ch);
		
		//unboxing
		System.out.println();
		System.out.println("Unboxing");
		char x = Character.valueOf(c);//c is a wrapper class object(in boxing)
		System.out.println("Unboxing by assigning char value to variable: "+x);
		char y = Character.valueOf('y');
		System.out.println("Unboxing by directly giving char value: "+y);
		
		//autounboxing
		char v = ch;  //ch is a wrapper class object(in boxing)
		System.out.println("autounboxing: "+v);
		
	}

}
