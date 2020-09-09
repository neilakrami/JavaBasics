package com.syntax.class02;

public class Variable {

	public static void main(String[] args) {
		/* name, lastName, grade, city state, phoneNumber
		 * 
		 * 
		 */
		
		String StudentInformation;
		
		String name = "John";
		String lastName = "Matthew";
		//char grade = 'A'; --- I can use like this too i
		//f it's one character
		String grade = "A";
		String city = "New York";	
		String state = "NY";
		int phoneNumber1 = 234234777;
		String phoneNumber = "(516) 999-8888";
		
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(phoneNumber1);
		System.out.println("-----------------");
	// b)
	// Change student's city, state, phone number and grad. Print them
		
	// String city = "CA";
	//Not possible
	// String city2= "John";
		
	
		city = "San Francisco";
		state = "CA";
		phoneNumber = "415-999-0000";
		grade = "A+";
		
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);
		
	}

}
