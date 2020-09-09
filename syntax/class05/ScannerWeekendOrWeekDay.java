package com.syntax.class05;

import java.util.Scanner;

public class ScannerWeekendOrWeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter day:");
	
	int day = scan.nextInt();
	if(day >= 1 && day <= 5) {
		System.out.println("It is weekday.");
	}else if (day >= 6 && day <=7) {
		System.out.println("It is weekend.");
		
	}else {
		System.out.println("Invalid Day!");
	}
	
	
	System.out.println("----------Using OR------------");
	if (day ==1 || day==2 || day==3 || day==4 || day==5) {
		System.out.println("It is a weekday.");
	}else if (day==6 || day==7) {
		System.out.println("It is a weekend.");
	}else {
		System.out.println("Invalid day");
	}
	
	
	
	
	
	
	
	
	}

}
