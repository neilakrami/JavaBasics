package com.syntax.class06;

import java.util.Scanner;

public class ScannerSwitchMonthAndSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your birth month:");
		
		String month = scan.next();
		
		String season;
		
		switch(month) {
		case "December":
		case "January":
		case "February":
			
			season = "Winter";
			break;
		case "March":
		case "April":
		case "May":
			season = "Spring";
			break;
		case "Jun":
		case "July":
		case "August":
			season = "Summer";
			break;
		case "September":
		case "October":
		case "November":
			season = "Fall";
			break;
		default:
			season = "Unknown";
		}
		
		System.out.println("Yor were born " + season);
	}

}
