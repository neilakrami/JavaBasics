package com.syntax.class14;

public class StringMethods {
	public static void main(String[] args) {
		
		//1 way to create a string using string literal --> this the most poular way
		String name = "olga";//literal
		
		//2 way to create string using new keyword
		String name1 = new String();
		name1 = "Olga";
		
		System.out.println(name);
		System.out.println(name1);
	
		
		//Methods of String class
	System.out.println("--------- .length() method------------");
		String school = "Syntax";
		
		int size = school.length();
		
		System.out.println("The length of the String is = "+ size);
	
		String greetings = " Hello Syntax ";
		int sizeOfDifferentString = greetings.length();
		System.out.println(sizeOfDifferentString);
	
	
	System.out.println("--------- .toUpperCase() method------------");

		String city = "Washington DC";
		String newCity = city.toUpperCase();
		System.out.println(newCity);
	
	System.out.println("--------- .toLowerCase() method------------");

	
		String lowerCasString = newCity.toLowerCase();
		System.out.println(lowerCasString);
	
	
	System.out.println("--------- .concat() method------------");
		String country = "USA ";
		String capital = "Washington DC";
	// + with Strings serves as concatenation operator
	// + with numbers serves as arithmetic operator
	
		System.out.println(country + capital);
		System.out.println(country.concat(capital));
	
		int day = 27;
		String month = " June ";
		System.out.println(day + month);
		System.out.println(month + day);
	
	//System.out.println(month.concat(day)); cannot use because both values must be string
	//System.out.println(day.concat(month)); CE: day is an int type and it does not have an access to string methods
	
	System.out.println("--------- .isEmpth() method------------");
	// if length of the String is = 0 --> then it is Empty
		
		String str = "m";
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty);
		
		String str1 = "";
		System.out.println(str1.isEmpty());
	
		
	System.out.println("--------- .trim() method------------");
		
	//removes spaces before and after the String
	String cat = "My cat name is Jass";
	String dog = "      My dog name       charly        ";
	
	System.out.println("------- Before Trimming -------------");
		System.out.println(cat);
		System.out.println(dog);
		
	System.out.println("------- After Trimming -------------");
		System.out.println(cat.trim());
		System.out.println(dog.trim());
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
