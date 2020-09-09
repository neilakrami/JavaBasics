package com.syntax.class31;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<>();
		//Storing objects inside map as a KEY and VALUE pair
		hmap.put(10, "John"); //K+V= Entry
		hmap.put(11, "Jane");//K+V= Entry
		hmap.put(12, "James");//K+V= Entry
		
		System.out.println(hmap);
		
		hmap.put(12, "Gozde");
		hmap.put(13, "Olga");
		//can have dublicate value
		hmap.put(1, "Olga");
		
		System.out.println(hmap);

		//how many entry objects inside the map?
		int entryObjects = hmap.size();
		System.out.println(entryObjects);
		
		//how to check in man has any elements?
		boolean isEmpty = hmap.isEmpty();
		System.out.println(isEmpty);
	
		
		//check if map has specific key or value?
		boolean hasKey = hmap.containsKey(12);
		System.out.println("Map contains key object 12 =" +hasKey);
		
		boolean hasValue = hmap.containsValue("John");
		System.out.println("Map has value as John ="+ hasValue);
		
		//how to retrieve 1 value froom the Map?
		String stringValue =hmap.get(13);//gets the v alue of specified key
		System.out.println(stringValue);
		
		//how to remove a key frrom a map
		hmap.remove(10);
		System.out.println(hmap);
		
		
	}

}
