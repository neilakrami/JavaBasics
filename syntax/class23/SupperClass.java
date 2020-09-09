package com.syntax.class23;

public class SupperClass {
	String name;
	public void printHello() {
		System.out.println("Hello from parent class");

}
}
class SubClass extends SupperClass{
	String name="Mina";
	
	public void displayName() {
		System.out.println(this.name);
		System.out.println(super.name);
	}
	public void printHello() {
		System.out.println("Hello from child class");
	}
	public void callingParentMethod() {
		super.printHello();
	}
	}

