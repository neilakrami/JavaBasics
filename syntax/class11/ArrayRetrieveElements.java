package com.syntax.class11;

public class ArrayRetrieveElements {

	public static void main(String[] args) {

		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		//getting all elements
		
		for(int i = 0; i < grades.length; i++) {
			
			System.out.print(grades[i] + ", ");
		}
		
System.out.println();


System.out.println("=======Print using advanced/enhanced loop, for each loop=======");

	for(char element : grades) {
		System.out.print(element  +  " ");
		
	}
System.out.println();
	System.out.println("=============================================");
	String[] fruits = {"Apple", "Orange", "Grapes", "Banana", "Cucumber", "tomato"};
	
	fruits[2] = null;
	fruits[3] = null;
	
	//1st way
	for (int j = 0; j < fruits.length; j++) {
		System.out.println(fruits[j]);
	}
	
	}}
//	// 2nd way
//	System.out.println();
//	System.out.println("=============================================");
//	for (String fruit : fruits) {
//		if (fruit.equals("Grapes")) {
//			System.out.println(fruits[j] + " is my favorite fruit");
////		}else {
////			
////		
//		System.out.print(fruit + ", ");
//	}
////	}
//	
//	
