package com.xworkz.packagesandimport.login.forgotpassword;

import com.xworkz.packagesandimport.login.Student;

public class ForgotPasswordTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the login details");
		
		com.xworkz.packagesandimport.login.LoginCheck lc = new com.xworkz.packagesandimport.login.LoginCheck("sunidhi","193791");
			System.out.println("usrname: "+lc.username);
			System.out.println("pwd: "+lc.password);
			
			lc.username = "Sunidhi";
			lc.enterUserName();
			lc.password = "su12ni34";
			lc.enterPassword();
		
		ForgotPassword np = new ForgotPassword();
		np.password = "su12ni34";
		np.password1 = "su32ni12";
		np.createNewPassword();
		
		System.out.println("another login");
		
		LoginCheck lc1 = new LoginCheck();
		lc1.username = "Sharadhi";
		lc1.password = "sh12ru34";
		lc1.enterUserName();
		lc1.enterPassword();
		
		Student st = new Student();
		st.name="Sunidh";
		st.usn="s9w9";
		st.studentLogin();
	}

}
