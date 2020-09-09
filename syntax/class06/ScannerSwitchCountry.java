package com.syntax.class06;

import java.util.Scanner;

public class ScannerSwitchCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your country: ");
		
		String country = scan.nextLine();
		String language;
		
		switch(country){
		case "USA":
		case "Canada":
		case "UK":
			language = "English";
		
		case "Chinca":
		case "Japan":
		case "Koria":
			language = "Mandrein";
		
		case "India":
		case "Pakistan":
		case "Nepal":
			language = "Hindi";
			break;
		default:
			language = "Unknown";
		}
		System.out.println("Your country language is "+ language);
	}

}
