
package com.syntax.class19;

public class Employee {
	
	public static String company;//any class from any packaged in the project 
	public String name, lastName;//any class from any packaged in the project 
	protected int age;//if calass within same package it can access all protected members
	double salary;//default - if we don't put modifier java will make it default
	private long ssn;//only it is own class/same can have an access to private members
	
	
	public static void displayCompany() {
		System.out.println("Employee works at "+company);
	}
	public void displayName() {
		System.out.println("Employee name is"+name + " "+lastName);
	}
	
	protected void displayAge() {
		System.out.println("Employee is "+age+" years old");
	}
	
	void displaySalary() {
		System.out.println("Employee salary is "+salary);
	}
	
	private void displaySsn() {
		System.out.println("Employee ssn is "+ssn);
		company = "Google";
		Employee emp = new Employee ();
		emp.name = "Ahmed";
		emp.lastName = "Smith";
		emp.age = 21;
		emp.salary = 90000;
		emp.ssn = 123456789;
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		emp.displayAge();
				
	}
}
