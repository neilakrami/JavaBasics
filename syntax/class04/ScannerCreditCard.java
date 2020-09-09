package com.syntax.class04;

import java.util.Scanner;

public class ScannerCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you have a credit car (yes or no)");
		
		String card = scan.nextLine();
		if(card.equalsIgnoreCase("Yes")) {
			System.out.println("What is balance on the card?");
			
		int balance = scan.nextInt();
		  if(balance > 1000) {
			  System.out.println("Please pay off immediatel.");
		  }else {
			  System.out.println("You can spend more.");
		  }
		}else {
			System.out.println("Would you like to have one?");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
