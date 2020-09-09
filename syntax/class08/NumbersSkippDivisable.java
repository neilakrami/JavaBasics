package com.syntax.class08;

public class NumbersSkippDivisable {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except 
		//those that are divisable by 3
		
		for (int i = 1; i <= 50; i++) {
			
			if (i % 3 == 0) {// divisable by 3
				continue;
				
			
			}
			System.out.println(i);
		}
		
		

		
		
	
		
		}
	}

