package com.syntax.class24;
//Create a class 'Degree' having a method 'getPrerequisite' 
//that prints ""To get a degree you need high school diploma"". 

//Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. 
//In Masters class override method 'getPrerequisite'.
//Call the method by creating an object of each of the three classes.

public class Degree {
//	String str;
//	public Degree(String str){
//		this.str=str;
//	}
	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
		
	}

}
class Bachelors extends Degree{
//	public Bachelors(String str) {
//		super(str);
//	}
	void getPrerequisite() {
		System.out.println("To get a degree I DONOT need high school diploma");
	}
}

class Masters extends Degree{
//	public Masters(String str) {
//		super(str);
//	}
}