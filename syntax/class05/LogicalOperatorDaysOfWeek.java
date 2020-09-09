package com.syntax.class05;

public class LogicalOperatorDaysOfWeek {

	public static void main(String[] args) {
		//  We have 7 days of week
		// if day is 2, 4--SDLC class
		// if day is 6,7 --> Java class
		// if day is 1,5 --> No class
		// if day is 3--> Review class

		int day = 5;
		
		if (day == 2 || day == 4) {
			System.out.println("SDLC Classes");
		}else if( day == 6 || day == 7) {
			System.out.println("Java Class");
		}else if (day == 1 || day == 5) {
			System.out.println("No class");
		}else if ( day == 3) {
			System.out.println("Review Class");
		}else {
			System.out.println("Wrond Day!");
		}
		
		
	}

}
