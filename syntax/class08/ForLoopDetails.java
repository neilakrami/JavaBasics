package com.syntax.class08;

public class ForLoopDetails {

	public static void main(String[] args) {
		// Loop Statement have three parts;
		// 1. initialization
		// 2. Condition
		// 3. Increment/decrement
				
		//for(//initialization; condition; increment/decrement) {
			    //}
				
		//for(;;){ <==== Most of the interview question is this how is thin infinite loop run.
				//}

		
		int i = 1;
		for(System.out.println("hi"); i<=5; System.out.println("bye")) {
			i++;
			System.out.println("how are you");
		}
		
	}
	

}
