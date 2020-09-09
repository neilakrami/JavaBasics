package com.syntax.class12;

import java.util.Arrays;

public class Q4SecondLargest {

	public static void main(String[] args) {
		// 2nd Largest number
		//Maximum and munimum number in array
		
		
//		
//
		int[] numbers = {32, 61, 16, 89, 74, 25};
		
		int largest = numbers[0];
		int largest2 = numbers[0];
		
		for (int num : numbers) {
			
			if (num > largest) {
				
			
			largest2 = largest;
			largest = num;
			
		}else if(num > largest2 && num != largest) {
			
			
		}
			
			
	}
		
		System.out.println("The largest is : "+ largest);
		System.out.println("Second largest is : "+ largest2);

//		//lets try find the max
//		
//		//1st way
//		int max = numbers[0];
//		int min = numbers[0];
//		for (int num : numbers) {
//			if (num > max) {
//				// I found a bigger number
//				max = num;
//				
//			}else if (num < min) {
//				// I found a smaller number
//				min = num;
//			}
//		}
//			
//		System.out.println("Maximum is: " + max);
//		System.out.println("Minimum is: " + min);
//		
//		//2nd way
//		Arrays.sort(numbers); //this is sorted the array from smallest to largest
//		System.out.println("Maximum is: " + numbers[numbers.length - 1]);
//		System.out.println("Second largest "+ numbers[numbers.length - 2]);
//		System.out.println("Minimum is: " + numbers[0]);
	}

}
