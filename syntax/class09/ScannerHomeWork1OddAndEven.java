package com.syntax.class09;

import java.util.Scanner;

public class ScannerHomeWork1OddAndEven {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (stars and end points)
		//provided by a user and then from that range 
		//prints the sum of the even and odd integers.
		//print also the sum of all totoal
		
		Scanner scan = new Scanner (System.in);
		int start, end;// I don't need to initialize because i will read form input.
		int sumOdd = 0;
		int sumEven = 0;
		int total = 0;
		
		System.out.println("Please enter a starting number:");
		
		start = scan.nextInt();
		System.out.println("Please enter an ending number:");
		end = scan.nextInt();
		
		for (int i = start; i<= end; i++) {
			
			if(i % 2 == 0 ) {// this is even number
				sumEven += i;
				
			}else {
				sumOdd += i;
			}
			//if(i % 2 == 1 ) {// this is odd number
			//	sumOdd += i;
			
			//}
			// 1st way
			//1
			//total +=i;
		// 100 *(101)/2 formula
		}
	System.out.println("The sum of even number is "+sumEven);
	System.out.println("The sum of odd number is "+sumOdd);
	//2nd way
	total = sumEven +sumOdd;
	System.out.println("The sum of all number is "+total);

	}

}
