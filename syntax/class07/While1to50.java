package com.syntax.class07;

public class While1to50 {

	public static void main(String[] args) {
	
		// how to print number from 1 to 50?

		int x = 1;
		while ( x <= 50) {
			
			System.out.println(x);
			x++;
			
		}
		
	System.out.println("=========================");	
	// how to print number from 2 to 30 include 0?
	
	System.out.println("How to print number from 20 to 30?");
	
	int y = 20;
	while ( y <= 30) {
		System.out.println(y);
		y++;
	}
	System.out.println("=========================");	
	System.out.println("How to print number from  5 to 15 at the same line?");
	
	
	int z = 5;
	while (z <= 15) {
		System.out.print( z + " " + " - ");
		z++;
	}
	System.out.println();
	System.out.println("=========================");
	System.out.println("How to print number from 10 to 1?");
	
	int k = 10;
	while (k >= 1) {
		System.out.println(k + " ");
		k--;
	}
	
	
	
	
	
	
	
	
	
	
	}

}
