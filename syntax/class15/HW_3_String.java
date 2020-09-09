package com.syntax.class15;

public class HW_3_String {

	public static void main(String[] args) {
		//interview question
		// Create a string and print it in reverse order (Sunday - yadanus)
	
		String day = "Sunday";
		String newString ="";
		
		for(int i = day.length()-1; i > 0; i--) {
			newString += day.charAt(i);
		}
		System.out.println(newString);
	}

}
