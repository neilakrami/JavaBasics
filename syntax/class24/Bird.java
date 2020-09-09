package com.syntax.class24;

public class Bird {

	public void fly() {
		System.out.println("Bird is flying");
	}
	public void eat() {
		System.out.println("Bird is eating");
	}
	public void sleeping() {
		System.out.println("Bird is sleeping");
	}

}
class BabyBird extends Bird{
	public void fly() {
		System.out.println("Baby bird can fly after few months");
	}
	public void eat() {
		System.out.println("baby bird needs help to eat");
	}
	public void cry() {
		System.out.println("Baby bird is cry");
	}
}