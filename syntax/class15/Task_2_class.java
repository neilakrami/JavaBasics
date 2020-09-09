package com.syntax.class15;

public class Task_2_class {

	public static void main(String[] args) {
		/*Interview Question
		 * 
		 * 
		 * Create a String that should 
		 * be combination of letters, 
		 * numbers and special characters. 
		 * Find out how many alpha characters 
		 * are there in the String.
		 */

		String str = "kldlfl 9808 &%^C^#%$#^";
		
		str = str.replaceAll("[^A-Za-z]", "");
		
		System.out.println(str.length());
		
	
	}

}
