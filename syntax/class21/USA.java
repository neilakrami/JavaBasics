package com.syntax.class21;

public class USA {

	public static String country;
	String state;
	String capital;
	
	USA(String usaState, String stateCapital){
		state= usaState;
		capital=stateCapital; 
		
		
	}

	void displayState() {
		System.out.println("stat is = "+state);
		
	}
	
	void displayCapital() {
		System.out.println("capital is = "+capital);
	}
	void displayInfo() {
		displayState();//this.displayState(): Compiler adds this to refer to  instance
		displayCapital();//this.displayState(): Compiler adds this to refer to 
	
//		System.out.println("stat is ="+state);
//		System.out.println("capital is = "+capital);
	}
	
	public static void main(String[] args) {
		
		
	}
}
