package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		//we want to ask users name 5 times and print Good Afternoon--
		//
		
		Scanner scan = new Scanner(System.in);
		int num =1;
		while (num <= 5) {
		
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		
		
		System.out.println("Good Afternoon " + name);
		
		num++;
		}
		System.out.println("---------------------------- ");
		
	int x = 1;
	do {
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
System.out.println("Good Afternoon " + x);
		
		x++;
	} while (x <= 5);
		
	}
	

}
