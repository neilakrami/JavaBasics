package com.syntax.class12;

public class Q3_FibonacciSeries {

	public static void main(String[] args) {
		// fibonacci series
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		
		int a, b, c;
		a = 1;
		b = 1;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " ");
			c = a + b;
			a = b;
			b = c;
			
			//hw. try to do it with 2 veriables
			
		}
	}

}
