package com.syntax.class24;

public class BirdTest {

	public static void main(String[] args) {
	// casting of non primitives
		
		Bird baby = new  BabyBird();//upcastin --> object of subclass is refereed by a suppercasting
		//achieving runtime polymorphism
		baby.fly();
		baby.eat();
		baby.sleeping();
		//baby.cry();//not available
		//during comilation compiler gives an access based on refference 
	
		
		System.out.println("=====================================");
		BabyBird bb = new BabyBird();
		bb.fly();
		bb.sleeping();
		bb.eat();
		bb.cry();
		
	}

}
