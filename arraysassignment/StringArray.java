package com.xworkz.arrays.arraysassignment;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Pen brands");
		
			String[] vals={"Flair","Reynolds","Cello","Parker","Jiffy"};
			
			for(int i=0;i<vals.length;i++) {
				System.out.println("Array vals using for: "+vals[i]);
			}
			
			for(String i : vals) {
				System.out.println("Array vals using for each:"+i);
			}

		}
	}


