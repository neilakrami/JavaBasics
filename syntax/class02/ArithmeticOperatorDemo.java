package com.syntax.class02;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		int sum = num1 + num2;
		
		int sub = num1 - num2;
		
		int multi = num1 * num2;
		
		int div = num1 / num2;
		
		System.out.println("addition -> " + num1 + num2);
		
		System.out.println("addition -> "+ sum);
		System.out.println("substraction -> "+ sub);
		System.out.println("multiplication -> " + multi);
		System.out.println("division -> " + div);
 
		
		double d1 = 3.4;
		double d2 = 5.73;
		double dSum = d1 + d2;
		System.out.println("Double addition -> "+ dSum);
		
		//you can store an integer as double
		double dSum2 = num1 + num2;
		System.out.println("dSum2 -> " + dSum2);
		
		System.out.println("*******************");
		
		//Order of operation
		System.out.println("Ahmet" + 10 + 30);
		
		//first parenthesis, then concatenation
		System.out.println("Ahmet" + (10 + 30));
		
		//first multiplication then concatenation 
		System.out.println("Ahmet" + 10 * 30);

	}

}
