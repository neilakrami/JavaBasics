package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Insurance_3_Task_Test {

	public static void main(String[] args) {
		
		//we need to store objects of Health, Pet, Car
	Set<Insurance_Task_3>insurance = new LinkedHashSet<>();
	insurance.add(new Car("Tesla","AAA"));
	insurance.add(new Pet("Cat", "Cigna"));
	insurance.add(new Health("Blue Cross Blue Shield"));
	
	//how to access variable and methods?
	
	for(Insurance_Task_3 ins : insurance) {
		
		//accessing variable
		System.out.println(ins.insuranceName);
		//accessing methods
		ins.getQuote();
		ins.cancelInsurance();
		System.out.println("------------------");
	}
	System.out.println("--------- Using Iterator----------");
	
	Iterator<Insurance_Task_3> it=insurance.iterator();
	while(it.hasNext()) {
		Insurance_Task_3 i = it.next();
		//accessing variables
		System.out.println(i.insuranceName);
		//accessing methods
		i.getQuote();
		i.cancelInsurance();
		System.out.println("-------------");
	}
	

	}

}
