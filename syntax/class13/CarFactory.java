package com.syntax.class13;

public class CarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// building an object of the car
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println("Make of first car is "+ car1.make+" and model is "+car1.model+
				" and it is in "+car1.color+ " and year of "+car1.year+ " and speed of "+car1.speed);
		
		System.out.println("=======Accessing methods from  Car class using car1======");
		car1.drive();
		car1.reverse();
		car1.transportPeople();
		//building an object of the car
		//calling variable
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "BLUE";
		car2.year = 2018;
		car2.speed = 240;
		
		System.out.println("Make of second car is : "+car2.make);
		
		System.out.println("=======Accessing methods from  Car class using car1======");
		//calling method
		car2.drive();
		car2.reverse();
		car2.transportPeople();
		//Bus bus1 = new Bus();====> compiler error
		// because we never created Bus class

		Car car3 = new Car();
		car3.make = "Bens";
		car3.model = "Benz";
		car3.color = "White";
		car3.year = 2015;
		car3.speed = 250;
		System.out.println("Make of third car is : "+car3.make);
		System.out.println("=======Accessing methods from  Car class using car1======");
		car3.drive();
		car3.reverse();
		car3.transportPeople();
		
		Car car4 = new Car();
		car4.make = "Toyota";
		car4.model = "Camery";
		car4.color = "Black";
		car4.year = 2019;
		car4.speed = 150;
		System.out.println("Make of fourth car is : "+car4.make);
		System.out.println("=======Accessing methods from  Car class using car1======");
		car4.drive();
		car4.reverse();
		car4.transportPeople();
	}

}
