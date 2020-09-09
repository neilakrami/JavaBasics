package com.syntax.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW_1_Task {
		
//		Create a Map from array of cities that will sort keys in alphabetical order.
		// As a key store the name of the city and as a value store the length of the city 
		// (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//			If any city name is more than 7 characters remove that city . 
			public static void main(String[] args) {
				
			
			Map<String, Integer> cities = new TreeMap<>();
			cities.put("Paris", 5);
			cities.put("Moskow", 6);
			cities.put("Washington DC", 13);
			cities.put("Vienna", 8);
			cities.put("Istanbul", 25);
			cities.put("Cairo", 4);
			cities.put("Kyiv", 2);
			
			Set<String> keys = cities.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()) {
				String key = it.next();
				if(key.length()>7) {
					it.remove();
				}
			}
			System.out.println(keys);
			System.out.println(cities);
			
			System.out.println("\n\n----Improved way--------");
			String[] citi ={"Washington","Los Angeles", "New York", "Miami", "Dallas"};
			
			Map<String, Integer> cityMap= new TreeMap<>();
		
//			for(int i = 0; i < citi.length; i++) {///---> one way using forloop
//				cityMap.put(citi[i], citi[i].length());
//				
//			}
			
			for(String c: citi) {
				//if(c.length() < 7) {
					cityMap.put(c, c.length());
				//}
				
			}
			System.out.println(cityMap);
			
		}
		

	}


