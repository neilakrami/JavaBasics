package com.syntax.class26;

public class VehicleTest {
	public static void main(String[] args) {
		
// Vehicle v = new Vehicle(); -->CE: cannot instantiate Abstract class
	Vehicle lambo =	new Lamborgini("12345Labargini");
	lambo.drive();
	lambo.start();
	lambo.stope();
	lambo.openTrunk();
	int total = Vehicle.getTotal();
	System.out.println(total);
	
	
	System.out.println("-------Second Object-------");
	Car car=new Lamborgini("Lamborgini12345");
	car.drive();
	car.start();
	car.stope();
	car.openTrunk();
	
	
	total=Car.getTotal();
	System.out.println(total);
	
	}
	

}
