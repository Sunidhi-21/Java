package com.xworkz.collections.arraylist.nov9;

import java.util.ArrayList;
import java.util.Collections;

public class TvTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Television> tvAL = new ArrayList<Television>();
		
		Television tv1 = new Television("LG", 55, "oled");
		Television tv2 = new Television("Samsung", 43, "led");
		Television tv3 = new Television("Sony", 50, "lcd");
		Television tv4 =  new Television("Sansui", 32, "plasma");
		
		tvAL.add(tv1);
		tvAL.add(tv2);
		tvAL.add(tv3);
		tvAL.add(tv4);
		
		Collections.sort(tvAL, new SortingTv());
		System.out.println(tvAL);
		
	}

}
