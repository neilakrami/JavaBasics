package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		//Let's have a date of month and a day of week
		//if it is Friday--> We are going to watch a movie
		//If date i 13 --> Watch SCARy movie
		// If date is not 13 --> Watch a COMEDY
		//if it is not Friday --> We are going to study JAVA
		
		boolean isFriday = false;
		int date = 17;
		
		if(isFriday) {
			System.out.println("It is Friday. I am going to watch a movie!");
		}else {
			System.out.println("It is NOT Friday. I am going to study JAVA!");
		}
		if(date == 13) {
			System.out.println("I will watch SCARY movie.");
		}else {
			System.out.println("I will watch a COMEDY.");
		}
	}

}
