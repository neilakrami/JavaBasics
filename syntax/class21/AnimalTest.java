package com.syntax.class21;

public class AnimalTest {

public static void main(String[] args) {
	 
//object of parent class has an access to all variable and methods of it
	Animal a = new Animal();
	 
	 a.breed="Somethin";
	 a.color="gray";
	 a.paws=4;
	 
	 a.sleep();
	 a.eat();
	 
	//object of child class has access to all va and method ot 
	 Dog dog= new Dog();
	 dog.breed="Husky";
	 dog.color="Yellow";
	 dog.paws=4;
	 dog.tail=true;
	 
	 dog.eat();
	 dog.sleep();
	 
	 //create an object of Cat class
}
}
