package com.xworkz.packagesandimport.login;

public class LoginTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginCheck l = new LoginCheck();
		LoginCheck lc = new LoginCheck("Sunidhi","su12ni34");
			System.out.println("username: " +lc.username);
			System.out.println("password: "+lc.password);
	}

}
