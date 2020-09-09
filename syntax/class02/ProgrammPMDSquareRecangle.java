package com.syntax.class02;

public class ProgrammPMDSquareRecangle {

	public static void main(String[] args) {
	//Write a Java program to add, subtract, 
	//multiply and divide 2 decimal values.
		
		double n1 = 10.10;
		double n2 = 20.10;
		
		double sum = n1 + n2;
		System.out.println("The addition of 2 numbers 10 and 20 is equal to ="+ sum +'.');
		
		double sub = n1 - n2;
		System.out.println("The Substraction of 2 numbers 10 and 20 is equal to   ="+sub+'.');
		
		double multi = n1 * n2;
		System.out.println("The Multiplication of 2 numbers 10 and 20 is equal to    ="+multi+'.');
		
		double div = n2 / n1;
		System.out.println("The Division of 2 numbers 10 and 20 is equal to   ="+div+'.');
		System.out.println("*******************************");

		
	// write a program to find the square of the number 3.9.
	//you program should  say "The square of the ---is---";	

		double num = 3.9;
		double square = num * num;
		
		System.out.println("The square of the 3.9 is " +num+ " is "+square+'.');
		
	//Write a program to print the area and perimeter of a rectangle with width =5 and height = 8.
	//your program should say. "The perimeter of a rectangle with width___and height___ is equal to ___and the area is___"
				
		int w = 9, h = 6;
		System.out.println("The perimeter of a rectancle with width "+w+ " " + " and height "+h+" "+" is equal to " +(w+h)*2 +" and area is  " + (w*h) + '.');
		
		
		
		
		
	}

}
