package com.syntax.class24;

public class Employee {
	double salary;
	
	void getPaid() {//overriden method
		System.out.println("Employe gets paid salary ="+salary);
	}
}

class Contractor extends Employee {
	double hourlyRate;
	
	void getPaid() {//overriding method
		System.out.println("Contructor gets paid hourly rate = " + hourlyRate);
	}
		
}
class FulltimeEmployee extends Employee{
	
}
