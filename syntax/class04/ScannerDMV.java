package com.syntax.class04;

import java.util.Scanner;

public class ScannerDMV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age:");
		
		int age = scan.nextInt();
		if(age >= 18) {
			System.out.println("You may have your licence.");
		}else {
			System.out.println("You may have learner permit.");
		}
	}

}
