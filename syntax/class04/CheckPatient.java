package com.syntax.class04;

public class CheckPatient {

	public static void main(String[] args) {
		//check if patient has allergies
		//if no allergies --> you are healthy
		//otherwise: 
		//if peanut allergy: Don't eat peanut
		//Lactose allergy: Don't eat milk
		//bee allergy: Don't mess with bees
		//seafood allergy: Don't eat fish
		
		boolean allergies = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = true;
		
		if (!allergies) {
		System.out.println("You are healthy");
	}else {
		
		if (peanut) {
			System.out.println("Don't eat peanut!");
		}
		if (lactose) {
			System.out.println("Don't drink milk!");
		}
		if (bee) {
			System.out.println("Don't mess with bees!");
		}
		if (seafood) {
			System.out.println("Don't eat fish!");
	}

	}
	}
}
