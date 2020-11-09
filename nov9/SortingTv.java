package com.xworkz.collections.arraylist.nov9;

import java.util.Comparator;

public class SortingTv implements Comparator<Television>{

	@Override
	public int compare(Television tv1, Television tv2) {
		// TODO Auto-generated method stub 
		//return tv1.getInches() - tv2.getInches(); //sorting acc to inches
		return tv2.getBrand().compareTo(tv1.getBrand()); //sorting acc to brand desc
        //return tv2.getType().compareTo(tv2.getType());   //sorting acc to type desc
		
	}

}
