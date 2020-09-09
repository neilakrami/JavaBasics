package com.syntax.class30;

import java.util.ArrayList;

/*
 * Create an arrayList of drinks. If any drink has letter “a” or
 *  “e” replace it with water. 
 */
public class ArrayLiistOfDrinks_1_Task {

	public static void main(String[] args) {
		

		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("Juice");
		drinks.add("Cola");
		drinks.add("Tea");
		drinks.add("Coffee");
		drinks.add("Beer");
		drinks.add("Milk");
		
		System.out.println(drinks);
		
		for (int i =0; i < drinks.size(); i++) {
			if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "Water");
			}
		}
		System.out.println(drinks +" ");
		
	}

}
