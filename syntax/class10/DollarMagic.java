package com.syntax.class10;

public class DollarMagic {

	public static void main(String[] args) {
		// Try to print
		//$$$$
		//$++$
		//$++$
		//$++$
		//$$$$
		
		for(int r =1; r <= 5; r++) {//The outer loop controls the rows
			
			for(int c = 1; c <= 4; c++) {//The inner loop controls rows for the colum
				if(r == 1 || r == 5) {//in the first and last row print everything
				
				System.out.print("$");
				
				}else {//in the other rows
				
					if (c ==1 || c==4) {// in the first or last colum print $
						System.out.print("$");
					}else {//in the other columns print +
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		//HW re-do this task without using nested if
		//hint: you should use && + ||
	}

}
