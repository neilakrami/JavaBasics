package com.syntax.class10;

public class HwNestedLoop {
public static void main(String[] args) {
	//There are 4 floors
	//Room numbers go from 1.1, 1.2...1.7
	
	//Task Ask the user how many floors does your hotel have?
	//And how many rooms in each floor
	//
	//If I want , I can read floors and rooms from a Scanner
	int  floor = 4;
	int rooms = 7;
	
	// We are iterating the floor
	for (int i = 1; i <= floor; i++) {
		System.out.print("We are in floor " +i+ "--->");
		//We are iterating the rooms
		for (int j = 1; j <= rooms; j++) {
			System.out.print(i+ "." +j+" ");
		}
		//The stairs to the next floor
		System.out.println();
	}
	System.out.println("=======================");
	
	int floors = 5;
	int room = 20;
	
	for (int i = 1; i <= floors; i++) {
		System.out.print("We  are in floor " +i+ "==>");
		
		for(int j = 1; j <= room; j++) {
			System.out.print(i+". " +j+" ");
		}
System.out.println();
}
}
}