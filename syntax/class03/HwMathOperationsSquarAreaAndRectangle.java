package com.syntax.class03;

public class HwMathOperationsSquarAreaAndRectangle {

	public static void main(String[] args) {
	//Write a Java program to add, subtract, multiply and divide 2 decimal values.
	//Your program should say. "The ___of 2 numbers__and is equal to__"

		double num1 = 3.5, num2 = 4.2;
		
		double sum = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		
		System.out.println("The addition of 2 numbers " + num1 + " and " + num2 +
				" is equal to " + sum );
		
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 +
				" is equal to " + mult );
		
		System.out.println("The substract of 2 numbers " + num1 + " and " + num2 +
				" is equal to " + sub );
		
		System.out.println("The divisionof 2 numbers " + num1 + " and " + num2 +
				" is equal to " + div );
		
		System.out.println("***************************Square************************************");
	//write a program to find the square of the number 3.9.
	//YOu program should say "The square of the ___ is ____"
		double number =  6.9;
		
		System.out.println("The squae of the "+3.9+" is "+number * number);
	
		System.out.println("*******************************Area Rectangle********************************");

	// write a program to print the arae an perimeter of a rectanle
	//with widthe  = 5 and height = 8. Your program should say.
	//"The perimeter of a rectanle with width___and height__ is equal to___and the area is __"
				
		int width = 5;
		int height = 8;
		int perimeter = 2* (width + height);
		int area = width * height;
		
		System.out.println("The perimeter of rectangle with width "+width+" and heigh "+height+" is equal to"+perimeter+ " and area is "+area+'.');
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
