package com.syntax.class27;

public class DrivableTest {

	public static void main(String[] args) {
	
		
		// new Drivable(); CE: cannot instantiate
		
		//new Motercycle(): CE: cannot instantiate
		
		System.out.println("---Drivable object type-------");
		Drivable d = new Bike();
		d.driving();
		d.breaking();
		System.out.println(Drivable.DRIVE);
		
		
		//Motercycle.DRIVER = "not safe"; CE: cannot change the value of final variable
		System.out.println();
		System.out.println("---Motercycle object type-------");
		Motercycle m = new Bike();
		m.breaking();
		m.driving();
		m.operateVehicle();
		System.out.println(Motercycle.DRIVE);// static variable accessible through class name
	
		
		System.out.println();
		System.out.println("---Vehicle object type-------");
		Vehicle v = new Bike();//Vehicle --> Motorcyle --->Bike
		v.operateVehicle();

	}

}
