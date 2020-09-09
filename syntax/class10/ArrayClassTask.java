package com.syntax.class10;

public class ArrayClassTask {

	public static void main(String[]args) {

		
		/*
		 * 1.Create an array of chars and store grades 
		 * into it: A,B,C,D,E,F. Then print a grade B 
		 * (use 2 different ways of creating an array).

			2.Create an array of names and store all names 
			of your group. Then print your name from that array. 
			(use 2 different ways of creating an array).
			
			3.Create an array of words: Java, Saturday, 
			day, coding, is. Print the following sentence using 
			elements of array: “Saturday is Java coding Day”.
		 */


		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		System.out.println(grades[1]);
		System.out.println("========================");
		char[] grades1 = {'A', 'B', 'C', 'D', 'F'};
		System.out.println(grades1[1]);
		
		System.out.println("========================");
		String[] Group = {"Madeeha Rizwan", "Matin Dede", "Mohammad Maaliji","Musa Ozdemir", "Neil", "Ummar Zahid", "Konstantin Tsypnyatov", "Mario Briseno"};
		System.out.println(Group[4]);
		
		System.out.println("========================");
		String[] words = {"Java", "Saturday", "day","coding", "is",};
		System.out.println(words[1]+ " " +words[4]+ " " +words[0]+ " " +words[3]+ " " +words[2]);
		
	}
	

}
