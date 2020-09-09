package com.syntax.class16;

public class MethodsWithReturnValue {

	public static void main(String[] args) {
		// Create a String and based on the number of character  define whether String is long or short
		//long if length > 10 , short if less
		
		String str = "I love Java";
		
		int length = str.length();
		if(length > 10) {
			System.out.println("created string is long");
		}else {
			System.out.println("created String is short");
		}

		//identify which number is the largest and than define whether this largest number if even or odd
		//
		TaskMethod obj = new TaskMethod();
		
	}

	
	int largest (int a, int b) {
		int largest;
		if (a > b) {
			largest = a;
			
		}else {
			largest = b;
		}
		
		return largest;
	}
}
