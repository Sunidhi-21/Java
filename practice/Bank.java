package com.xworkz.test.practice;

public class Bank {
		
		public String acctNo;
		private int balance; //critical
		
		public Bank(String acctNo) {
			this.acctNo = acctNo;
			this.balance = 10000;
		}
		
		public void deposit(int amount, String acctNo) {
			if(amount > 0) {
				System.out.println("Depositing the amount : "+ amount);
				balance+=amount;
				checkBalance();
			} else {
				System.out.println("Entered Wrong amount");
			}
		}
		
		public void withdraw(int amount, String acctNo ) {
			System.out.println("withdrawing the amount : "+ amount);
			balance -= amount;
			checkBalance();
		}
		
		public void checkBalance() {
			System.out.println("Your Current Balance: "+ balance);
		}
		

	}

