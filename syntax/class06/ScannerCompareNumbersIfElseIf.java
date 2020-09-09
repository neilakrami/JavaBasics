package com.syntax.class06;

import java.util.Scanner;

public class ScannerCompareNumbersIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		double num1 = scan.nextDouble();
		
		System.out.println("Please enter the second number:");
		double num2 = scan.nextDouble();
		
		System.out.println("Please enter the third number: ");
		double num3 = scan.nextDouble();
		double largest = 0;
		
		if(num1 > num2 && num1 > num3) {
			largest = num1;
			
		}else if(num2 > num3) {
			largest = num2;
		}else {
			largest = num3;
		}
	System.out.println("Largest number is "+ largest + '.');
	}

}
