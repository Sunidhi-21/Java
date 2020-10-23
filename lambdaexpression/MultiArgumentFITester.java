package com.xworkz.anonymousclass.lambdaexpression;

public class MultiArgumentFITester {

	public static void main(String[] args) {

		MultiArgumentFI multiArgumentFI = (str1,str2)->{
			String str3 = str1.concat(str2);
			return str3;
		};
		String str3 = multiArgumentFI.ConcatTwoString("Hello", " World");
		System.out.println(str3);
	}

}
