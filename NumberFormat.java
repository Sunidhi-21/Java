package com.xworkz.excepionhandling.assignment;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		String st = "123.33";
		
		 System.out.println("start");
	        try {  
	                 int a = Integer.parseInt(st); 
	        }catch(NumberFormatException ex){  
	            System.out.println("Invalid string in argumment");
	        	}
	       System.out.println("end");
	}  
}


