package com.syntax.class32;

public abstract class Animal {

	protected String type;
	protected String color;
	
	public  Animal(String type, String color){
		
		this.type = type;
		this.color = color;
	}

	public  abstract void eat();
	public abstract void sleep();
}

class Dog extends Animal {
	
	public Dog(String type, String color) {
	super(type, color);
}
	public   void eat() {
		System.out.println(type +" eats bones");
	}
	
	public  void sleep() {
		System.out.println(type +" sleeps at home ");
	}
}

class Zebra extends Animal{
	
	public Zebra(String type, String color) {
		super(type, color);
	}
	public  void eat() {
		System.out.println(type +" eats Grass");
	}
	public void sleep() {
		System.out.println(type +" sleeps ");
	}
	
	
class Monkey extends Animal{
	public Monkey(String type, String color) {
		super(type, color);
	}

	public void eat() {
		System.out.println(type +" eats banana");
		
	}

	public void sleep() {
		System.out.println(type +" sleeps ");		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}