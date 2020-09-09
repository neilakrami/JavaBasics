package com.syntax.class19;

public class AccessingEmployeeClassMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.name= "Godze";
		emp.lastName = "Doe";
		emp.age = 30;
		emp.salary = 100000;
	//emp.ssn -->wont be available because it is private

		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
	//	emp.displaySsn(); won't be available because it is private
		
	}

}
