package com.syntax.class21;

import com.syntax.repl.it.Main;

// * Write program as a Book class   that will have 
// * instance variables and 2 Constructors. 
// * While creating an object make sure:
// * Instance variables are being initialized
///* Both Constructors are being executed

public class Book{
	public Book() {
		System.out.println("You may read book");
	}
	
	String name;
	String author;
	int pages;
	
	Book(String name, String author, int pages){
		this.name=name;
		this.author=author;
		this.pages=pages;
	}
	void display() {
		System.out.println("This book name is "+name);
	
	}
	public static void main(String[] args) {
		Book obj = new Book("The order", "Dan", 456);
		obj.display();
	}


//ackage com.syntax.class21;
//public class Student {
//	String name, address;
//	Student(String name, String address) {
//		this.name = name;
//		this.address = address;
//	}
//	
//	void displayInfo () {
//		System.out.println(name + ", " + address);;
//	}
//	public static void main(String[] args) {
//	
//	Student one = new Student("John Doe", "123 Main Street");
//	one.displayInfo();
//	
//	}
//}