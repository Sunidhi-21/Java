package com.xworkz.typecasting.assignment;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 'b'; //
		System.out.println(i);
		int a= i;
		byte p=(byte)(int)(long)'b';
		System.out.println(p);
		
	}

}
//byte,short,int,long
//float,double,char,boolean
//converting bigger size datatype to smaller one is called narrowing
//converting smaller size datatype to bigger one is called widening