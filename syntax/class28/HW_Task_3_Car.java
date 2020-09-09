package com.syntax.class28;
/*Create a Class Car that would have the following fields: 
 * carPrice and color and method calculateSalePrice() 
 * which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has field
 as weight and has its own implementation of  calculateSalePrice()
  method in which returned price calculated as following: if weight>2000 
  then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 * 
 */
public class HW_Task_3_Car {

	String color;
	double carPrice;
	
	HW_Task_3_Car(double carPrice, String color){
		this.carPrice=carPrice;
		this.color=color;
	}
	
	double calculateSalePrice() {
		return carPrice;
	}
}

class Truck extends HW_Task_3_Car{
	
	double weight;
	
	Truck(double carPrice, String color, double weigth){
		super(carPrice, color);
		this.weight=weight;
	}
	
	double  calculateSalePrice() {
		if(weight > 2000) {
			return carPrice -(carPrice * 0.1);
		}else {
			return carPrice - (carPrice * 0.2);
		}
	}
}

class Sedan extends HW_Task_3_Car{
	double length;
	
	Sedan(double carPrice, String color, double length){
		super(carPrice, color);
		this.length = length;
	}
	
	double calculateSalePrice() {
		
		if(length > 20) {
			return carPrice - (carPrice * 0.5);
		}else {
			
			return carPrice - (carPrice * 0.1);
		}
		
	}
}





