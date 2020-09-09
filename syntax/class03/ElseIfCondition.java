package com.syntax.class03;

public class ElseIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 10.7;
		double num2 = 10.7;
		
		if(num1 > num2) {
			System.out.println("Number1is larger than number2.");
			
		}else if (num1 < num2) {
			System.out.println("Number2 is larger than number1.");
		}else {
			System.out.println("Numbers are equal.");
		}
		System.out.println("We are done!");
	}

}
