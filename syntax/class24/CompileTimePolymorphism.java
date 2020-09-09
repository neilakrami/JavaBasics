package com.syntax.class24;

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		
		String str ="Saturday";
		String day = str.substring(5);
		System.out.println(day);
		
		String newString = str.substring(0, 5);
		System.out.println(newString);
		
	}

}
