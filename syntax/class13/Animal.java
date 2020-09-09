package com.syntax.class13;

public class Animal {

	String breed;
	String name;
	String color;
	
public static void main(String[] args) {
	
		
		Animal Husky = new Animal();
		
		Husky.breed = "Husky";
		Husky.name = "Husky";
		Husky.color = "Black";
		
		Husky.bark();
		Husky.run();
		Husky.play();
		
		
		Animal Bulldog = new Animal();
		
		Bulldog.breed = "Bulldog";
		Bulldog.name = "Bulldog";
		Bulldog.color = "White";
		
		Bulldog.bark();
		Bulldog.run();
		Bulldog.play();
		
	Animal Labrador = new Animal();
		
	Labrador.breed = "Labrador";
	Labrador.name = "Labrador";
	Labrador.color = "Brown";
		
	Labrador.bark();
	Labrador.run();
	Labrador.play();
		
		
		
}

	void bark() {
		System.out.println(name+ " can bark");
	}
	void run() {
		System.out.println(name+ " can run");
	}
	void play() {
		System.out.println(name+ " can play");
	}
}
