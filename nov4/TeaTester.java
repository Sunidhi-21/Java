package com.xworkz.collections.arraylist.nov4;

import java.util.ArrayList;

public class TeaTester {

	public static void main(String[] args) {
		
		Tea t1 = new Tea("TajMahal",60,false);
		Tea t2 = new Tea("Lipton",50,true);
		Tea t3 = new Tea("Tetley",65,true);
		Tea t4 = new Tea("RedLabel",60,false);
		Tea t5 = new Tea("BrookeBond",68,true);
		Tea t6 = new Tea("WaghBakri",45,false);
		
		ArrayList<Tea> teaArrList = new ArrayList<Tea>();
		teaArrList.add(t1);
		teaArrList.add(t2);
		teaArrList.add(t3);
		teaArrList.add(t4);
	
		System.out.println("Traversing using forEach()");
		teaArrList.forEach((n)->System.out.println(n));
		System.out.println("--------------------");
		
		System.out.println("Traversin using for");
		for(int i=0; i<teaArrList.size();i++) {
			Tea tea = teaArrList.get(i);
			System.out.println(tea);
			
		}System.out.println("--------------------");
		
		System.out.println("Traversin using enhanced for:");
		for(Tea t : teaArrList) {
			System.out.println(t);
		}System.out.println("--------------------");
		
		System.out.println("display last element: ");
		System.out.println(teaArrList.get(teaArrList.size()-1));
		System.out.println("---------------------");
		
		System.out.println("update 3rd element with new element ");
		teaArrList.set(3, t5);
		System.out.println(teaArrList);	
		System.out.println("---------------------");
		
		System.out.println("update 0th element with new element ");
		teaArrList.set(0,t6);
		System.out.println(teaArrList);
	}

}
