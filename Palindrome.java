package com.xworkz.exceptionhandling.assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		
		try {
			p.palindrome(0);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	 void palindrome(int n) throws Exception {
		int r,rev=0;
		int num=n;
		
		if(n==0){
			Exception e = new Exception("Enter non zero number");
			throw e;
		}
		else {
			while(n!=0)	{
			r=n%10;
			n=n/10;
		
			rev=rev*10+r;
			}
			if(num==rev)
				System.out.println("entered number is palindrome");
			else
				System.out.println("entered number is not palindrome");
		}
	}
}
