package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* Task-2
 * Create a Set of cities in which you want to make sure that insertion order is maintained. 
 * Using Iterator remove any city that starts with “A”;
 */
public class Cities {
	public static void main(String[] args) {
		

		Set<String> city = new LinkedHashSet<>();
		
		city.add("NY");
		city.add("Albany");
		city.add("Amsterdam");
		city.add("San Francisco");
		
		//LinkedHash
	
		
		Iterator<String> itCity = city.iterator();
		while(itCity.hasNext()) {
			String cities = itCity.next();
			if(cities.startsWith("A")) {
				itCity.remove();
			}
		}
		System.out.println(itCity);
	}

}

//Set<String> cities = new LinkedHashSet<>();
//cities.add("Kiev");
//cities.add("Moscow");
//cities.add("Washington DC");
//cities.add("Paris");
//cities.add("Almaty");
//
//Iterator<String> itCity = cities.iterator();
//while(itCity.hasNext()) {
//	String city = itCity.next();
//	if(city.startsWith("A")) {
//		itCity.remove();
//	}
//}
//System.out.println(cities);
//System.out.println();

//public static void main(String[] args) {
//	LinkedHashSet<String> city= new LinkedHashSet<>();
//	
//	city.add(“Ankara”);
//	city.add(“Isparta”);
//	city.add(“Adana”);
//	city.add(“Antalya”);
//	
//	
//	Iterator <String> it= city.iterator();
//	while(it.hasNext()) {
//		String str= it.next();
//		if(str.startsWith(“A”)) {
//			it.remove();
//		}
//	}
//	
//	System.out.println(city);
//}