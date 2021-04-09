package com.xworkz.packagesandimport.login;

public class LoginCheck {
	
	public String username;
	public String password;
	
	public LoginCheck(){
		System.out.println("Enter login details"); 
	}
	
	public LoginCheck(String stusername,String stpassword) {
		username = stusername;
		password = stpassword;
	}
	
	public void enterUserName() {
		System.out.println(username);
	}
	public void enterPassword() {
		System.out.println(password);
		System.out.println("u are logged in");
	}

}
