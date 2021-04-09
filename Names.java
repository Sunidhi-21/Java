package com.xworkz.strings;

public class Names {

	public static void main(String[] args) {
		
		//different ways of comparing 2 strings

		String str1 = "Sunidhi";
		String str2 = "Sunidhi";
		String str3 = "Sharadhi";

		System.out.println("Comparing str1 and str2 using equals: " + str1.equals(str2));//
		System.out.println("Comparing str1 and str3 using equals: " + str1.equals(str3));
		System.out.println("Comparing str1 and str2 using ==: " + (str1 == str2));
		System.out.println("Comparing str1 and str3 using ==: " + (str1 == str3));
		System.out.println("Comparing str1 and str3 using compareTo: " + (str1.compareTo(str2)));
		System.out.println("Comparing str1 and str3 using compareTo: " + (str1.compareTo(str3)));

		String s1 = new String("Sunidhi");
		String s2 = new String("Sunidhi");
		String s3 = new String("Sharadhi");

		System.out.println("=================================================");
		System.out.println("Comparing s1 and s2 using equals: " + s1.equals(s2));
		System.out.println("Comparing s1 and s2 using equals: " + s1.equals(s3));
		System.out.println("Comparing s1 and s2 using ==: " + (s1 == s2));
		System.out.println("Comparing s1 and s2 using ==: " + (s1 == s3));
		System.out.println("Comparing s1 and s2 using compareTo: " + (s1.compareTo(s2)));
		System.out.println("Comparing s1 and s3 using compareTo: " + (s1.compareTo(s3)));
		
		System.out.println(s1.substring(1,4));
		
		System.out.println(String.valueOf(2));
	}

}
