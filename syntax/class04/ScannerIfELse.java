package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfELse {

	public static void main(String[] args) {
	//*Capture 2 number from a user
	//* Compare those numbers
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number:");
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number:");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+ " is larger than "+num2);
		}else if (num1 == num2) {
			System.out.println(num1+ " is smaller than "+num2);
		}else {
			System.out.println(num2+ " is larger than "+num1);
		}

		
		
		
		
		
		
	  	Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String name = inp.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	if(name.equals("Chen")){
	  	  System.out.println("teacher");
	  	  }
	  	 	System.out.print("In:"); 
	  	String stud = inp.nextLine();
	  	if(stud.equals("Faa")){
	  	  System.out.println("student");
	  	}
	}
}