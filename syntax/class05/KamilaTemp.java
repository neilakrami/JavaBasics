package com.syntax.class05;

import java.util.Scanner;

public class KamilaTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your city!");
		
		String city = scan.nextLine();
		System.out.println("Please enter the temeperature in Fahrenheight!");
		
		int tempF = scan.nextInt();
		int tempC = (tempF - 32) * 5/9;
		System.out.println("The temperature in Fahrenheit of the city "+city+" is "+tempF);
	}

}
