package com.syntax.class19;

public class Class_Task_3_Vowels {
	/*Create a method that will accept 
	 *a string as a parameter and return a new string
	 *that consist only of vowels.Method should be available 
	 *inside the class where it was declared and
	 *executed by calling it is name.
	 *
	 */
	
	
	private static String displayVowels(String value) {
		return value.replaceAll(“[^aeiouAEIOU]“, “”);
		
}

//	private static String Vowel(String word) {
//		String print = “”;
//		for (int i = 0; i < word.length(); i++) {
//			if (word.charAt(i) == ‘a’ || word.charAt(i) == ‘e’ || word.charAt(i) == ‘i’ || word.charAt(i) == ‘o’
//					|| word.charAt(i) == ‘u’) {
//			print+=word.charAt(i)+” “;
//			}
//		}
//		return print;
//	}