package com.syntax.class28;

public class HW_Task_3_Car_Test {

	public static void main(String[] args) {
		
		HW_Task_3_Car c1 = new Truck(35000.44, "Blue",2500.0);
		System.out.println("The Truck price with discount is: "+c1.calculateSalePrice());
		
		
		
		HW_Task_3_Car c2 = new  Sedan(55000.44, "Black",5500.0);
		System.out.println("The Sedan car price with discount is: "+c2.calculateSalePrice());
	}
	
	

}
