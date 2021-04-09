package com.xworkz.packagesandimport.search;

import com.xworkz.packagesandimport.login.*;

public class SearchItemsTester{
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.name = "asha";
		st1.usn = "82496yr8";
		st1.studentLogin();
		
		LoginCheck lc = new LoginCheck("sunidhi","193791");
		
		System.out.println("usrname: "+lc.username);
		System.out.println("pwd: "+lc.password);
	
	}
}