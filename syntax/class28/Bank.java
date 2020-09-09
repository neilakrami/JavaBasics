package com.syntax.class28;

public class Bank {
	private long accountNumber;
	private double balance;
	
	//setter
	public void setAccountNumber(long accountNumber) {
		// here can be some validation points
		if(accountNumber >= 9) {
			this.accountNumber = accountNumber;
		}
	}
	
	//getter
	public  long getAccountNumber() {
		//here can be many validation points
		return accountNumber;
	}
	
	
//setter
	public void setBalance(double balance ) {
		//here can be many validation points
		this.balance=balance;
	}
//getter
	public double getBalance() {
		// here can be many validation points
		return balance;
	}
}
