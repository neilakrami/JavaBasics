package com.syntax.class10;

public class HomWorkPattern {

	public static void main(String[] args) {
		//Please print the following pattern
		//55555
		//4444
		//333
		//22
		//1
		
//		for (int r = 5; r >= 1; r--) {
//
//			for (int c = 1; c <= r; c++) {
//
//				System.out.print(r);
//			}
//			System.out.println();
//		}

		//Please print the following pattern
		//54321
		//4321
		//321
		//21
		//1
		System.out.println("===========================");
		
	
		for (int i = 7; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i =1; i <= 7; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		}
		//Please print the following pattern
				//1
				//21
				//321
				//4321
				//54321
				//4321
				//231
				//21
				//1
//		System.out.println("===============================");
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//			if(i==5) {
//				for(int a=4;a>=1;a--) {
//					for(int b=a;b>=1;b--) {
//						System.out.print(b);
//					}
//					System.out.println();
//				}
//			}
//		}

	}


