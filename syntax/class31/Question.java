package com.syntax.class31;



import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question {

	public static void main(String[] args) {
		
		// how can you remove all duplicates from ArrayList?
		
		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("John");
		aList.add("Jane");
		
		Set<String> set = new LinkedHashSet<>(aList);
		System.out.println(set);
		
		//how to get/retieve only 1 specific elemen?
		Set<String> Llist = new LinkedHashSet<>(aList);
		Llist.add("Kazakhstan");
		Llist.add("USA");
		Llist.add("Germany");
		Llist.add("England");
		Llist.add("Italy");
		
		
		List<String> list = new ArrayList<>(set);
		String country= list.get(2);
		System.out.println(country);
		
		

	}

}
