package com.syntax.class06;

import java.util.Scanner;

public class ScannerBirthMonth {

	public static void main(String[] args) {
		//Albert Einstein said: 
		//Spend 95 % of the time to understand the problem
		// Spend 5% of the time to solving the problem.
		
		//Write a program for user to enter his/hers birth month.
		//Based on the month define the season.
		//Example: if user is born in June, July or August --> season = "Summer".
		//At the end of the program we should see output as "You were born_____".
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter you birth mont.");
		
		String month = scan.nextLine();
		
		String season;
		
		if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
				season = "Winter";
		
		}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
				season = "Spring";
		}else if(month.equalsIgnoreCase("Jun") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
				season = "Summer";
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")){
				season = "Fall";
		}else {
			season = "Unknown";
		
			
		}
	
	System.out.println("You were born in " + season + '.');
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
