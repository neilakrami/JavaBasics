package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedObjectsInSet {

	public static void main(String[] args) {
	
		//we need to store objects of heal, pet, car
		Set<Insurance> lset=new LinkedHashSet<>();
		lset.add(new Pet("Cat","Cigna"));
		lset.add(new Car("Tesla","Geico"));
		lset.add(new Health("Blue Cross Blue Shield"));
		
		//how to access variable and method
		
		for(Insurance ins:lset) {
			//accessing variable
			System.out.println(ins.insuranceName);
			//calling methods
			ins.getQuote();
			ins.cancelInsurance();
			
			System.out.println("------------------------");
		}
		
		System.out.println("--------USING ITERATOR----------");
		Iterator<Insurance> it=lset.iterator();
		
		while(it.hasNext()) {
			Insurance i =it.next();
			//accessing variable
			System.out.println(i.insuranceName);
			
			//accessing method
			
			i.getQuote();
			i.cancelInsurance();
			System.out.println("------------------------");
		}
	}

}
