package com.xworkz.strings;

public class CharacterSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Folks";
		System.out.println(swap(str, 0, 10));
		
	}

	static String swap(String str, int i, int j) {
		StringBuilder strB = new StringBuilder(str);
		char l = strB.charAt(i), r = strB.charAt(j);
		strB.setCharAt(i, r);
		strB.setCharAt(j, l);
		return strB.toString();
	}

}


