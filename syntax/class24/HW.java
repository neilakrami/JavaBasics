package com.syntax.class24;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism

class Human{
	public void happy() {
		System.out.println("Humans are happy");
		
	}
public void study() {
	System.out.println("Hunans should study");
}
}

public class HW {
	public class Student extends Human{
		public void study() {
			System.out.println("All students are study");
		}
		public void sleepy() {
			System.out.println("Students are always sleepy");
		}
	}
	class SyntaxStudent extends Student {
		public void inLoveWithJava() {
			System.out.println("Syntax students love JAVA the most");
		}
		public void study() {
			System.out.println("Syntax students studying harder then anybody");
		}
		public void sleepy() {
			System.out.println("We are never sleep");
		}
	}
	class CollegeStudent extends Student {
		public void read() {
			System.out.println("College students read tonns of books");
		}
	}
	class SchoolStudent extends Student {
		public void study() {
			System.out.println("School time - best time ever");
		}
	}










}
