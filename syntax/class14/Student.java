package com.syntax.class14;

public class Student {

	String name;
	String lastName;
	String school;
	char grade;
	int studentId;
	
	void study(){
		System.out.println(name+" "+lastName+" from "+school+" college with grade of "+grade+" and student id "+studentId+" is studying hard");
	}
	void doHomwork() {
		System.out.println(name+" "+lastName+" is doing Homework");
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.name="Jane";
		student.lastName="Doe";
		student.grade='A';
		student.school="";
		student.studentId= 1234;
		student.school="Merritt";
		
		student.study();
		student.doHomwork();
		
		Student student1 = new Student();
		
		student1.name = "Jane";
		student1.lastName = "Smit";
		student1.school = "Las Positas";
		student1.grade = 'b';
		student1.studentId = 567;
		student1.study();
		student1.doHomwork();
	}
}
