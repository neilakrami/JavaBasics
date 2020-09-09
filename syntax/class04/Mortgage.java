package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		//Create a Java program and store values of mortgage 
		//rate and mortgage price. First, program should check 
		//if rate is higher than 4.5 user will not buy a house, 
		//otherwise user will consider buying. Once user decides to buy a house, 
		//if price of the house is larger than 200000 than user will take a loan, 
		//otherwise user will pay cash.
		
		int rate = 4;
		int mortgage = 200000;
		if (rate > 4.5) {
			System.out.println("I can't buy a house.");
		}else {
			System.out.println("I can buy a house.");
			if(mortgage > 100000) {
				System.out.println("I need a loan.");
			}else {
				System.out.println("I am gonna pay cash.");
			}
		}
	}

}
