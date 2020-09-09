package com.syntax.class21;

public class Constructor {
	String word;
	public Constructor() {
		System.out.println("I am  a non argument constructor");
		
		
	}
	public Constructor(String word) {
		this(5,word);//If need  to make a call Always must be a 1 statement inside the constructor
		this.word=word;
		System.out.println("I am a parameterized constructor with string = "+word);
		//this(); CE: because this must be in first 1 line
	}
	Constructor(int num, String word){
		System.out.println("I am constructor with 2 parameter = "+num+" and "+word);
	}
	
//	Constructor(int num){ //CE: we cannot have duplicate constructor even with different variables
//		System.out.println("I am constructor with 1 parameter = "+num);
//	}
	
	public static void main(String[] args) {
		
		Constructor obj =new Constructor("Java");
		System.out.println(obj.word);
	}
	void hello() {
		//this.(); CE:
	}
}
