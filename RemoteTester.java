package com.xworkz.abstraction.assignment;

public class RemoteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TvRemote tvRemote = new TvRemote();
		tvRemote.buttons = 18;
		tvRemote.size = 25;
		tvRemote.brand = "Sony";
		tvRemote.type = "Smart tv remote";
		
		tvRemote.mainPurpose();
		tvRemote.operations();
		tvRemote.volume();
		tvRemote.changingChannel();
		tvRemote.displayDetails();
		
		System.out.println("====================================");
		Remote remote = new TvRemote();//upcasting
		remote.buttons = 10;
		remote.size = 15;
		remote.mainPurpose();
		remote.operations();
		remote.volume();
		remote.changingChannel();
		remote.displayDetails();
		
		
	}

}
