package com.syntax.class15;

import java.util.Scanner;

public class HW_2_Scanner_String {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first
			names and if they expecting boy or girl? 
			Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY
			
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter father's name: ");
		String fname = scan.nextLine();
		
		System.out.println("Please enter mother's name: ");
		String mname = scan.nextLine();
		
		System.out.println("Is it boy or girel? ");
		
		String gender = scan.nextLine();
		
		String babyName;
		
		//Boy ---> boy.equals("boy")
		
		if(gender.toLowerCase().equals("boy")) {
			System.out.println("Congratulations, It is a boy.");
			babyName = fname.substring(0, fname.length()/2) +mname.substring(mname.length()/2);
		}else if( gender.equalsIgnoreCase("girl")) {
			
			System.out.println("Congratulations, It is a girl");
			babyName = mname.substring(0, mname.length()/2)+fname.substring(fname.length()/2);
			
		}else {
			babyName = "unknown";
		}
		
		System.out.println(babyName.toUpperCase());
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
