package com.syntax.class15;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		// task 2;Create a String that will hold a sentence. 
		//Write a program to get a new String without 
		//any spaces.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentece");
		String sentences = scan.nextLine();
		
		System.out.println("Original sentence is "+sentences);
		
		sentences = sentences.replace(" ", "");
		System.out.println("Modified sentence is "+sentences);

		
		//task 2;
		
		
	}

}
