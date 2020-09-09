package com.syntax.class19;

public class Class_Task_2_ReversedString {
	/*Create a method that will take a String 
	 * as a parameter and returns reversed String. 
	 * Method should be available to all classes 
	 * within your project and accessible by class name.
	 * 
	 */
	
		public static String rev (String str) {
			String a = "";
			for(int i = str.length()-1; i>=0; i--) {
				a = a + str.charAt(i);
			}
			return a;
		}
	}


private static String displayVowels(String value) {
	str = str.replaceAll(“[^aeiouAEIOU]“, “”);
	return str;