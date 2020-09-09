package com.syntax.class28;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Ali","QA");
		emp.setSalary(90000);
		double salary = emp.getSalary();
		System.out.println(salary);
		
		emp.setAge(1);
		System.out.println(emp.getAge());
		
		emp.setEmpID(-120);
		System.out.println(emp.getEmpId());
		
		emp.ssn=4338789989l;
	}
}
