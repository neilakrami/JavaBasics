package com.syntax.class05;

public class LogicalOperator {

	public static void main(String[] args) {
		// Declare a number
		// if number is between 1-10 --> number is small
		// if number is between 1-100 --> number is big
		// if number is between 1-1001 --> number is large
		
		int num = 1001;
		
		if( num >= 1 && num <= 10) {
			System.out.println("Number is small!");
		}else if (num >= 1 && num <= 100) {
			System.out.println("Number is big!");
		}else if (num >= 1 && num <= 1001) {
			System.out.println("Number is large");
		}

	}

}
