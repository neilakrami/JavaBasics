package com.syntax.class20;

public class ConstructorTypes {
	
	ConstructorTypes(){
		System.out.println("I am a constructor");
	}

		ConstructorTypes obj= new ConstructorTypes();{
		System.out.println("I am a constructor with 1 parameter");
			// TODO Auto-generated method stub
		}
		
	
public static void main(String []args) {
	ConstructorTypes obj = new ConstructorTypes();
	
	System.out.println("I am a code inside main method");
	
	//speak("Hello Class");
			
}
}
