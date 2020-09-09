package com.syntax.class19;

public class iPhone {
// Static variable which is common in all iphones	
	static String brand = "Apple";
	static String  OS = "iOS";
	static boolean touchScreen = true;

// local or instance veriables which is different in each iphone
	String model;
	int memory;
	double price;
	String color;
	
	static void displayInfo() {//static works only with static
		System.out.println("iPhone belongs to brand "+
				brand+" and it has OS "+OS+" and all iphones have touchscreen"+touchScreen);
	}

//	void displayDetails() { Static methods cannot access instance/non static members/variables
//		System.out.println("We build iPhone "+color+ " with memory =" + memory+
//				" price is  = $"+ price);
//}

	void displayDetails() { 
		System.out.println("We build iPhone "+color+ " with memory =" + memory+
				" price is  = $"+ price);
}
	
	static void displayInfo1() {//Instance works only with static and non static
		System.out.println("iPhone belongs to brand "+
				brand+" and it has OS "+OS+" and all iphones have touchscreen"+touchScreen);
	}
	
	//can instance method/ non static method access static members?
}