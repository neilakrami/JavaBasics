package com.syntax.class24;

import com.syntax.class24.HW.CollegeStudent;
import com.syntax.class24.HW.Student;
import com.syntax.class24.HW.SyntaxStudent;

public class StudentTest {
	
public static void main(String[] args) {
	
	SyntaxStudent syntax = new SyntaxStudent();
	syntax.sleepy();
	syntax.study();
	syntax.sleepy();
	syntax.inLoveWithJava();
	
	System.out.println("-------Creating an object of College------");
	CollegeStudent col = new  CollegeStudent();
	col.read();
	col.study();
	col.sleepy();
	
	System.out.println("--Creating an objecto of student ");
	Student stu = new Student();
	stu.study();
	stu.sleepy();
	
	System.out.println("----Ceating an object of college student but");
	Student obj = new CollegeStudent();
	obj.study();
	obj.sleepy();
	
	
	System.out.println("---Creating an object of syntax student but give");
	Student ss=new SyntaxStudent();
	ss.study();
	ss.sleepy();

	Human obj1 = new Human();
	obj1.happy();
	obj.study();
}
}
