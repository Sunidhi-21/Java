package com.xworkz.exceptionhandling.customexceptions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Using Scanner to input a number"+"\n"+"Enter the number: ");
		
		Scanner sc = new Scanner(System.in);
		primeNumber(sc.nextInt());
		
		System.out.println();
		
		System.out.println("Using args to give input");
		
		String str = args[0];
		int n1=Integer.parseInt(str);
		System.out.println("The number is: "+n1);
		primeNumber(n1);
		  
	}

	private static void primeNumber(int n) {
		
		if(n==0) {
			CustomException ce = new CustomException();
			throw ce;
		}
		else {
		
			int m=0,flag=0;     
			  
			  m=n/2;      
			  
			  if(n==0||n==1){  
				  
			   System.out.println(n+" is not prime number");
			   
			  }
			  else{ 
				  
			   for(int i=2;i<=m;i++){ 
				   
				 if(n%i==0){     
			    	
			       System.out.println(n+" is not prime number");      
			       flag=1;
			       break;
			     
			    } 
			    
			   } 
			   if(flag==0)  {
				   
				   System.out.println(n+" is prime number"); }  
			  }
		}

	}
}