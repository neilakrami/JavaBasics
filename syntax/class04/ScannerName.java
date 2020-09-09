package com.syntax.class04;

import java.util.Scanner;

public class ScannerName {

	public static void main(String[] args) {
		/*Capture name from a user and 
		 * print in the format 
		 * My name is______
		 * 
		 * 1. Bring Scanner class into a grogram
		 * System.in--> identifies keyboard
		 */
		
		Scanner scan = new Scanner(System.in);
	//Instruct user of what program expects
		System.out.println("Please enter your name:");
	//Capture line of String from a user
		String name = scan.next();
		System.out.println("My name is: " +name);
	//Instruct user of what program expects
		System.out.println("How old are you?");
	//capture number from a user
		int age = scan.nextInt();
		System.out.println("You name is "+name+" and your age is "+age+'.');
	}

}
