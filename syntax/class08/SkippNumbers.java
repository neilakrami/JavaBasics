package com.syntax.class08;

public class SkippNumbers {

	public static void main(String[] args) {
		// I want to print from 1 to 10
		//but I want to skip 5, 6 and 7
		
		System.out.println("Skipping numbers 5,6,7");
		for (int i = 1; i <= 10; i++) {
			
			
			if( i == 5 || i == 6 || i == 7) {
				continue;
			}
			
			
			System.out.println(i);
		}

		System.out.println("===========1 - 100 ===========");
		
		for (int i = 1; i < 100; i++) {
			
			if (i >= 35 && i <= 55) {
				continue;
				
			}
		System.out.println(i);
		}
		
	}

}
