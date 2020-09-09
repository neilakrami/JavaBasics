package com.syntax.class31;
/* Task - 3
 * Create a Set collection that will hold Objects of Student Type. 
 * In this set we do not care about the insertion order.
 *  Each student object should have name and studentID. Display name of each student.
 */
public class Student {


//HashSet

//package com.syntax.class31;
//public class Student {
	public int id;
	public String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println(this.name + " has student id "+this.id);
	}
	
}