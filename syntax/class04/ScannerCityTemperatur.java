package com.syntax.class04;

import java.util.Scanner;

public class ScannerCityTemperatur {

	public static void main(String[] args) {
		// City Temperature
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your city?");
	
	String city = scan.nextLine();
	System.out.println("Please enter the city teperature in Fahrenheit:");
	
	int tempF = scan.nextInt();
	int tempC =  ((tempF - 32) * 5/ 9);
	
	System.out.println("The temperature in the " +city+ " city is "+tempF+"F");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
