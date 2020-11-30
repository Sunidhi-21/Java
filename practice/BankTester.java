package com.xworkz.test.practice;

public class BankTester {

	public static void main(String[] args) {

				
		Bank acct = new Bank("ICIC09978");
		
		acct.checkBalance();
//		acct.balance = 0;
		
		
		acct.deposit(-10000, "ICIC09978");
		
//		acct.checkBalance();

	}

}
