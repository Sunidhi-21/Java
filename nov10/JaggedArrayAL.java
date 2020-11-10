package com.xworkz.collections.arraylist.nov10;

import java.util.ArrayList;

public class JaggedArrayAL {

	public static void main(String[] args) {
		
		int n = 5; 
		 
        ArrayList<Integer>[] al = new ArrayList[n]; 
  
        // initializing 
        for (int i = 0; i < n; i++) { 
            al[i] = new ArrayList<Integer>(); 
        } 
  
        al[0].add(1); 
        al[0].add(2); 
        al[1].add(5); 
        al[2].add(10); 
        al[2].add(20); 
        al[2].add(30); 
        al[3].add(56); 
        al[4].add(34); 
        al[4].add(67); 
        al[4].add(89); 
        al[4].add(12); 
  
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < al[i].size(); j++) { 
                System.out.print(al[i].get(j) + " "); 
            } 
            System.out.println(); 
        } 
	}
}
