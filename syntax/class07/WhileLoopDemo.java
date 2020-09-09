package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
	// while check the condition first then execute
		int time = 10;
//		
//		if (time >12) {
//			System.out.println("Good Morning!");
//		}
		System.out.println("========While Loop===========");
		
// 	This code will execute infinitely
		while (time <= 12) {
//We fixed it by adding time++
			System.out.println("Good Morning");
			time++;
		}
//		
//		while (time > 12) {
//			// This block of code will not execute
//			System.out.println("Good Morning");
//			time++;
//		}
	
	
		System.out.println("========While Loop isRain===========");
		
		boolean isRain = true;
		if (isRain) {
			System.out.println("Take your umbrella");// 1 time
		}
		while (isRain) {
			System.out.println("Take your umbrella");// infinitely
		}
		System.out.println("========While Loop isRain===========");
		
		while (isRain) {
			System.out.println("Take your umbrella");
			//isRain++;// compiler error
			isRain = false;
		}
		
		
		
	}

}
