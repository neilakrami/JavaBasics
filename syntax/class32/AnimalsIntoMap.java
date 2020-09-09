package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class AnimalsIntoMap {

	public static void main(String[] args) {
		

		Map<Integer, Animal>life = new LinkedHashMap<>();
		life.put(1, new Dog("Dog", "Grey"));
 //		life.put(2, new Monkey("Monkey", "Brown"));
		life.put(3, new Zebra("Zebra", "Black and White"));
		
		
		System.out.println("         Using EntrySet                ");
		
		Set<Entry<Integer, Animal>> entries = life.entrySet();
		
		System.out.println("        Access all variables and all availbale methods            ");
		
		for(Entry<Integer, Animal >e:entries) {
			Animal animal = e.getValue();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println(" ----------------------");
		}
		
		
		
		
		System.out.println("              2 --------- Using values()---------------");
		
		Collection<Animal>values=life.values();
		
		for( Animal animal:values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			
		}
		
		
		
		Iterator<Entry<Integer, Animal>> it =entries.iterator();
		
		while(it.hasNext()) {
		Entry<Integer, Animal> entry=it.next();
		System.out.println(entry.getKey()+"==="+entry.getValue());
		
		System.out.println("              3 --------- Using Iterator()---------------");
		
		

		
		
		System.out.println("              3 --------- Using KeySet()---------------");
		Set<Integer>keys = life.keySet();
		for(Integer key:keys) {
			Animal animal = life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			
			
			//write with Iterator
		}
	}

	}}
