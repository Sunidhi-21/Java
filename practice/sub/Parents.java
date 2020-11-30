package com.xworkz.test.practice.sub;

import com.xworkz.test.practice.Me;

public class Parents extends Me {
	
	void accessMyRoom() {
		System.out.println("Only i can access my room: "+myRoom);
	}
}
