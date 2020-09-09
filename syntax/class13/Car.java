package com.syntax.class13;

public class Car{

	
		// define car features in form of bariables
		
		String make;
		String model;
		String color;
		int speed;
		int year;
	
		public static void main(String[] args) {
			System.out.println("Hello, I am code from main method");
		}
		//define behavior in form of methods
		void drive() {
			
			System.out.println("Car can drive");
		}

		void reverse() {
		System.out.println("Car can reverse");
	}
		void transportPeople() {
			System.out.println("Car can transport people");
		}
		
		
}
