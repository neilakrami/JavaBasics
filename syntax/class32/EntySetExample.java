package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntySetExample {

	public static void main(String[] args) {
		

		Map<Integer, String> floors = new LinkedHashMap<>();
		floors.put(1, "Aidana & CO. ");
		floors.put(2, "Sema & CO. ");
		floors.put(3, "Kamila & CO. ");
		floors.put(4, "Mina & CO. ");
		floors.put(5, "Sema & CO. ");
		floors.put(2, "olga & CO. ");
		floors.put(6, "Kamila & CO. ");
		
		System.out.println("Floors map: "+floors);
		
		System.out.println();
		Set<Entry<Integer, String>> entries= floors.entrySet();
		System.out.println("Set of Entry Objects: "+entries);
			
		System.out.println();
		
		System.out.println("-----------------Retrieving key and value pair from Entry using for loop------------");
		System.out.println();
		for(Entry<Integer, String> ent: entries) {
			System.out.println(ent.getKey()+" ---"+ ent.getValue());
		}
		
		System.out.println("-----------------Retrieving key and value pair from Entry using iterator------------");

		Iterator<Entry<Integer, String>> it =entries.iterator();
	
		while(it.hasNext()) {
		Entry<Integer, String> entry=it.next();
		System.out.println(entry.getKey()+"==="+entry.getValue());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
		}
	}
