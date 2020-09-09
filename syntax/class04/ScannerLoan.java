package com.syntax.class04;

import java.util.Scanner;

public class ScannerLoan {

	public static void main(String[] args) {
		// Loan money
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much loan you need?");
		
		int loan = scan.nextInt();
		System.out.println("The loan amount you entered is "+loan);
			if (loan <=200000) {
				System.out.println("Your is approved.");
			}else {
				System.out.println("Your loan is declined.");
			}
	}

}
