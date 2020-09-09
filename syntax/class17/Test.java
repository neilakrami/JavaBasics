package com.syntax.class17;

public class Test {

	public static void main(String[] args) {

	
	
		ClassTaskOne t = new ClassTaskOne();
		String email = t.createEmail("Jane", "Smith", "Gmail");
		System.out.println(email);
	
	
		

	

	ClassTaskTwo  prime =  new ClassTaskTwo();
	boolean primenum = prime.isPrime(2);
	System.out.println(prime);
	
	ClassTaskThree student = new ClassTaskThree();
	
	char grade = student .getGrade(90);
	char grade1 = student.getGrade(90);
	System.out.println("value of grade"+grade);

	System.out.println("value of grade 1 = "+grade1);
	
	}
}