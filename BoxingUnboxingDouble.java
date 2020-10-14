package com.xworkz.wrapperclass.assignment;

public class BoxingUnboxingDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("boxing/wrapping");
		double a = 0.01;
		Double c = new Double(a); 
		System.out.println("boxing by assigning double value to variable: "+c);
		Double d = new Double(0.02);
		System.out.println("boxing by giving double value directly: "+d);
		
		//autoboxing
		Double h = a;
		System.out.println("autoboxing by assigning double value to variable: "+h);
		Double ch = 2.1;
		System.out.println("autoboxing by directly giving double value: "+ch);
		
		//unboxing
		System.out.println();
		System.out.println("Unboxing");
		double x = Double.valueOf(c);//c is a wrapper class object(in boxing)
		System.out.println("Unboxing by assigning double value to variable: "+x);
		double y = Double.valueOf(9.1);
		System.out.println("Unboxing by directly giving double value: "+y);
		
		//autounboxing
		double v = ch;  //ch is a wrapper class object(in boxing)
		System.out.println("autounboxing: "+v);
		
	}

}
