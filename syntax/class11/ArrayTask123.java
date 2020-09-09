package com.syntax.class11;

public class ArrayTask123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cars = new int[6];

		int totale = cars.length;
		System.out.println(totale);

		System.out.println("============================");

		int[] numbers = { 23, 56, 73, 16, 80, 70, 39 };
		int sum = 0;

		for (int num : numbers) {
			sum += num;

		}
		System.out.println("The sum of all numbers is: " + sum);

		System.out.println("=====using for loop======");

		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			total += num;
		}
		System.out.println("The total of all numbers is: " + total);

		System.out.println("=================Countries=====================");

		String[] countries = { "Tajkistan", "Barazil", "Gambia", "US", "Pakistan" };

		
		
		for (String country : countries) {

			if (country.equals("Albania")) {
				System.out.println("Tirana");
			} else if (country.equals("Brzil")) {
				System.out.println("Brasilia");
			} else if (country.equals("US") || country.equals("USA")) {
				System.out.println("Washington DC");

			} else if (country.equals("TaJiksistan")) {
				System.out.println("Dushanba");
			} else if (country.equalsIgnoreCase("Gambia")) {
				System.out.println("Banjul");
			} else {
				System.out.println("The country " + country + " is not in my list.");
			}
		}
	System.out.println("=======2nd way============");
	
	
	
	
	
	
	
	//"Tajkistan", "Barazil", "Gambia", "US", "Pakistan" };

	
	for (int i = 0; i < countries.length; i++) {
		String country = countries[i];
		
		switch (countries[i]) {
		case  "Tajkistan":
			System.out.println("Dushanbe");
			break;
			
		case "US":
			System.out.println("Washington DC");
			break;
			
		case "Brazil":
			System.out.println("Brasilia");
			break;
			
		case "Albania":
			System.out.println("Tirana");
			break;
			
		case "Gamia":
			System.out.println("Banjul");
			break;
			
		default:
			System.out.println("NOT in my list");
		}
		
		
		
		
		
	}
	
	
	System.out.println("========professional way=================");
	
	String[] countries1 = { "Tajkistan", "Barazil", "Gambia", "US", "Pakistan" };
	
	//Elion way
	String[] cpitalCities = { "Dushanbe", "Brasilia", "Islamabad", "Banjul", "Washingtop DC"};
	
	for (int i = 0; i < countries1.length; i++) {
		String country1 = countries1[i];
		String city =  cpitalCities[i];
//		System.out.println("The capital of " + country1[i] + " is " + city);
//		
	}
	
	}
	
//HW: Try to solve this way with one enhanced for loop
	//Hint: You should not be able to do it
}
