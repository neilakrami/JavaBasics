package com.syntax.class20;

public class BetterCar {
	
	static String make;
	protected String model, color;
	int year,door,speed;
	private double price;
	
	public void displayInfo() {
		System.out.println("We build "+color+" "+year+" "+ " "+model +" for price = $"+price);
	}
	//this isconstructor
	BetterCar(String carModel, String carColor, int carYear, double carPrice){
		
		model=carModel;
		color = carColor;
		year = carYear;
		price = carPrice;
	}
}
