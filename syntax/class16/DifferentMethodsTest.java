package com.syntax.class16;

public class DifferentMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DifferentMethods obj= new DifferentMethods();
		//call method sayHello
		obj.sayHello(5);
		
		System.out.println("------");
		obj.sayHello(8);
		
		//call method printAnyWord
		obj.printAnyWord("I love you", 3);
		
		obj.printAnyWord("Bye", 5);
		
		//call method isHungary
		obj.isHungry(true);
	}

}
