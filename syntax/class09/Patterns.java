package com.syntax.class09;

public class Patterns {
	public static void main(String[] args) {

		/*
		 * I want to print this patern 
		 * ***** 
		 * ***** 
		 * ***** 
		 * *****
		 */
//
//		System.out.println("Silly way, Not nested loop");
//		for (int i = 1; i <= 4; i++) {
//			System.out.println("*****");
//		}
//		System.out.println("Another Silly way");
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("*");
//			
//		}
//System.out.println();

//		System.out.println("-----------First way-----------");
//		for (int i = 1; i <= 4; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//
//			}
//			System.out.println("--------Pattern 10X10-----------");
//			
			for (int i = 1; i <= 10; i++) {
			
				for (int j = 1; j <= 10; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

	}
}
