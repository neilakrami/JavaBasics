package com.syntax.class20;

public class Car {
	
	static String make;//static or comman
	
	protected String model, color;
	int year,door,speed;
	private double price;

	public void displayInfo() {
		System.out.println("We build "+year+" "+make+" "+model+"for price = $"+price);
	
	
	}
	Car(){
		System.out.println("I am a constructor");
	}

	public static void main(String[] args) {
		 
		Car car = new Car();
		/*	Car--> class name
		 * 	car--> reference variable name
		 * 	new--> keyword
		 * 	Car();--> calling constructor--> block of the code that initialize the object
		 */
		
		make="BMW";
		car.model="M5";
		car.year=2021;
		car.color="Pink";
		car.door=2;
		car.speed=200;
		car.price= 90000;
		
		
		Car car1=new Car();
		car1.model="i5";
		car1.year=2020;
		car1.color="Blue";
		car1.door=4;
		car1.speed=180;
		
		car.displayInfo();
		car1.displayInfo();
		
		
		//static String driver;--> local variable CANNOT be static
		//System.out.println(car.driver);
	}
}
