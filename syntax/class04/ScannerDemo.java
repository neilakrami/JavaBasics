package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Please wrie some text and press enter!");
		
		String text = scan.nextLine();
		
		System.out.println("===========================================");
		System.out.println(text);
		
// int a = (int) "Thirty three"; Compile time error
// int a = 33.4; Compile time error
		
		System.out.println("Enter age:");
		int age = scan.nextInt();
		System.out.println("The age that you entered is " + age);
		
		
		
		
		
		
	}

}
