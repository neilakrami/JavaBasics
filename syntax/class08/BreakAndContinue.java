package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// We are counting from 1 to 10
		// We want to stop the loop when reach4
		
		System.out.println("=====Break======");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			if(i == 4) {
				//stopping the loop
				break;
			}
			
		}
		System.out.println("We are outside of the loop");
		
		
		System.out.println("=====COndtinue======");
		for (int i = 1; i <= 10; i++) {
			
			
			if(i == 4) {
				System.out.println("I am skipping 4 in continue loop");
				//continue the loop
				continue;
			}
			System.out.println(i);
		}
		System.out.println("We are outside of the loop");
	}

}
