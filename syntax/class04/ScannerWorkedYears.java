package com.syntax.class04;

import java.util.Scanner;

public class ScannerWorkedYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter how many years you worked.");
		
		int years = scan.nextInt();
		System.out.println("Please enter your salary");
		
		int salary =scan.nextInt();
		if(years >= 5) {
			System.out.println("You are eligible for the bonus.");
			if (salary > 50000) {
				System.out.println("You bonus is 5000.");
			}else {
				System.out.println("Your bonus is 3000.");
			}
		}else {
			System.out.println("Sorry!");
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
