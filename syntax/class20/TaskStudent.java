package com.syntax.class20;
/*
 * Write a java program of Class Students 
 * that takes students name and 3 subject grades. 
 * Inside your class also have a method to Calculate
 * Average Grade. Test Student class for 5 different 
 * students with different marks. Your program should 
 * print an average mark of each students name.
 */
public class TaskStudent {
	
	String name;
	int mathGrade, scienceGrade, historyGrade;
	
	TaskStudent(String studentName, int studentMathGrade,int studentScienceGrade, int studentHistoryGrade){
		
		name = studentName;
		mathGrade = studentMathGrade;
		scienceGrade=studentScienceGrade;
	}
	
	int calculatAvarageGrade() {
		int avarage = (mathGrade+ scienceGrade+historyGrade);
		return avarage;
	}
	
	public static void main(String []args){
	TaskStudent student1 = new TaskStudent("Smith", 70, 80, 83);
	TaskStudent student2 = new TaskStudent("Adam", 49, 23, 94);
	TaskStudent student3 = new TaskStudent("Lucy", 98, 53, 45);
	TaskStudent student4 = new TaskStudent("Mary", 78, 15, 0);
	TaskStudent student5 = new TaskStudent("Ahmet", 67, 89, 99);
	
	student1.calculatAvarageGrade();
	student2.calculatAvarageGrade();
	student3.calculatAvarageGrade();
	student4.calculatAvarageGrade();
	student5.calculatAvarageGrade();


}
}