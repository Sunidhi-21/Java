package com.xworkz.strings;

public class Vowels {

	public static void main(String[] args) {
		
		int count=0;
		String str = "dart";
		for(int i=0;i<str.length();i++) {
			
			char a = str.charAt(i);
			if(a=='a' || a== 'e' || a=='i' || a=='o'|| a=='u')
				count++;
			
		}
		System.out.println(count);
	}
}
