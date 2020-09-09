package com.syntax.class02;

public class StringConcatenationDemo {

	public static void main(String[] args) {
		// I love Castro
		String name = "Castro";
		
		System.out.println("I love "+ name);
		System.out.println("I loove "+ " " +name);
		
		String statement = "I love";
		
		System.out.println(statement + " "+ name);

		String car = "BMW";
		int year = 2020;
		
		System.out.println(car + " of year "+ year);
	}

}
