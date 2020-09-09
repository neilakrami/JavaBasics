package com.syntax.class13;

public class DogSpecies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Dog Husky = new Dog();
		Husky.name = "Husky";
		Husky.color = "White";
		Husky.age = 4;
		System.out.println("The dog name is "+Husky.name
				+", the color is "+Husky.color+
				", and age is "+Husky.age+ " years only.");
		Husky.bark();
		Husky.sleep();
		Husky.eat();

		
		System.out.println();
		System.out.println();
		Dog Bulldog = new Dog();
		Bulldog.name = "Bulldog";
		Bulldog.color = "Brown";
		Bulldog.age = 8;
		System.out.println("The dog name is "+Bulldog.name
				+", the color is "+Bulldog.color+
				", and age is "+Bulldog.age+ " years only.");
		Bulldog.bark();
		Bulldog.sleep();
		Bulldog.eat();
		
		
		System.out.println();
		System.out.println();
		Dog Labrador = new Dog();
		Labrador.name = "Labrador";
		Labrador.color = "Blak";
		Labrador.age = 10;
		System.out.println("The dog name is "+Labrador.name
				+", the color is "+Labrador.color+
				", and age is "+Labrador.age+ " years only.");
		Labrador.bark();
		Labrador.sleep();
		Labrador.eat();

		
	}

}
