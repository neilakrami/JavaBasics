package com.syntax.class27;

public interface Drivable {// interface is collection of public abstract methods and public, static, final variables
	
	String DRIVE = "Drive safe";//by default compiler adds public static and final to variable in interface classes
	
	//int maxSpeed; cannot have instance variables because compiler adds Public, Static and Final
	
	void driving();//By default compiler adds public abstracto methods
	
	void breaking();
}

//whe can extends ONLY 1 class but we can implements MULTIPLE Interface
abstract class Motercycle extends Vehicle implements Drivable {//abstract class
	
	public void driving() {
		System.out.println("Motercycle is driving");
	}
	public void breaking() {
		System.out.println("Motercyle is breaking");
	}
	
}

class Bike extends Motercycle{// concrete class
	public void breaking() {
		System.out.println("Bikes can break");
	}
	
	
}
class Vehicle{
	public void operateVehicle() {
		System.out.println("To operate any vehicle we need to have driver lisence");
	}
}