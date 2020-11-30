package com.xworkz.test.practice.sub;

import com.xworkz.test.practice.Me;

public class Relatives {
	
	Me me = new Me();

	void accessMyRoom() {
		System.out.println("Only i can access my room: "+me.myRoom);
	}

}
