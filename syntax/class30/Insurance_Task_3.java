package com.syntax.class30;
/*
 * Create a class Insurance that will have an attribute as 
 * insuranceName and unimplemented behaviour as getQuote and cancelInsurance. 
 * Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute 
 * as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes 
 * and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class. 

 */
public abstract class Insurance_Task_3 {

	String insuranceName;
	
	public Insurance_Task_3(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	
	public abstract void getQuote();
	
	public abstract void cancelInsurance();
}

class Car extends Insurance_Task_3{
	
	String carModel;
	
	public Car(String carModel, String insuranceName) {
		super(insuranceName);
		this.carModel = carModel;
		
	}

	@Override
	public void getQuote() {
		System.out.println("Get a quote for "+carModel + " from "+insuranceName );
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel the insurance for "+carModel + " from "+insuranceName );
		
	}
}

class Pet extends Insurance_Task_3{

	String petType;
	public Pet(String petType, String insuranceName) {
		super(insuranceName);
		this.petType = petType;

	}
	public  void cancelInsurance() {
		System.out.println("Cancel insurance for "+petType+" from "+ insuranceName );
	}
	@Override
	public void getQuote() {
		System.out.println("Ge a quote for "+petType+" from "+ insuranceName );
		
	}
	
}
class Health extends Insurance_Task_3{
	public Health(String insuranceName) {
		super(insuranceName);
	
	}

	@Override
	public void getQuote() {
		System.out.println("I am a getQuote method in Health class");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("I am a cancelInsurance method in Health class");
		
	}
	
}



























