package com.xworkz.collections.queue.nov11;

public class JaggedArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][];
		
		arr[0]= new int[3];
		arr[1]= new int[2];
		arr[2]= new int[1];
		
		int count=0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=count++; //adding elements to the jagged array
		
		System.out.println("Jagged array elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) 
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
