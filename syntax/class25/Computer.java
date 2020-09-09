package com.syntax.class25;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
//

public class Computer {
	String  name, type;
	long RAM;
	public Computer(String type, String name, long RAM) {
		this.type=type;
		this.name = name;
		this.RAM=RAM;
	}
	public void Camera() {
		System.out.println(name+" has camera" + type);
	}
	public void Charger() {
		System.out.println(name+" has charger "+ type);
	}
	
}
class Apple extends Computer{
	public Apple(String type, String name, long RAM) {
		super(name, type, RAM);
	}
	public void MacOS() {
		System.out.println(name+ " has a Mac OS "+type);
	}
	public  void Camera() {
		System.out.println(name+ " has HD camera ");
	}
}
class Lenovo extends Computer{
	public Lenovo(String type, String name, long RAM) {
		super (name, type, RAM);
	}
	public void Chager() {
		System.out.println(name+" has wireless charger "+type);
	}
}

class HP extends Computer{
	public HP(String type, String name, long RAM) {
		super (name, type, RAM);
	}
	public void Camera() {
		System.out.println(name+" has 4K "+type);
	}
}

class Dell extends Computer{
	String color;
	public Dell(String type, String name, long RAM, String color) {
		super (name, type, RAM);
		this.color=color;
	}
	public void Camera() {
		System.out.println(name+" has 4K "+type);
	}
}