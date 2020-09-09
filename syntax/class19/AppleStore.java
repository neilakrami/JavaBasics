package com.syntax.class19;

public class AppleStore {

	public static void main(String[] args) {
		
		iPhone phone1 = new iPhone();
		
		phone1.model = "11 Pro";
		phone1.memory = 256;
		phone1.color = "Blue";
		phone1.price = 1000;
		phone1.displayDetails();
		phone1.displayInfo();

		iPhone.touchScreen = false;
				
		System.out.println();
System.out.println("---- 2 iPhone object --------");
	

iPhone phone2 = new iPhone();
	
	phone2.model = "11";
	phone2.memory = 64;
	phone2.color = "Blacke";
	phone2.price = 900;
	phone2.displayDetails();
	phone2.displayInfo();

	System.out.println();
	System.err.println("-------calling info method again -------");
	phone1.displayInfo();
	
}
}