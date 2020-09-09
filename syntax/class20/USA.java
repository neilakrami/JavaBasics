package com.syntax.class20;


public class USA {

//define 2 variables for state and capital and have a constructor to initialize it.
	
	public static String country;
	String state;
	String capital;
	
	USA(String usaState, String stateCapital){
		state= usaState;
		capital=stateCapital; 
		
		
	}

	public void display() {
		System.out.println("State  "+state+" and it is capital"+capital);
	}
public static void main(String[]args) {
	USA state1 = new USA("California", " Sacramento.");
	state1.display();
	
}
}
