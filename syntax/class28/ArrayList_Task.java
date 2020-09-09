package com.syntax.class28;

import java.util.ArrayList;

public class ArrayList_Task {

	public static void main(String[] args) {
		/* Create an ArrayList that will store 5 names into it.
		 * Find out whether the given ArrayList is empty or not?
		 * check whether the specific name is present in an ArrayList or not?
		 * Find the size of your arrayList and print all values from that
		 * 
		 */
		
		
		ArrayList<String> aname = new ArrayList<>();
		
		aname.add("John");
		aname.add("Alex");
		aname.add("Jimme");
		aname.add("Smith");
		aname.add("Safi");
		
		System.out.println(aname);
		System.out.println(aname.size());
		
		aname.clear();
		System.out.println(aname);// all cleared
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Ahmet");
		list.add("Gozde");
		list.add("Kamila");
		list.add("Ihsan");
		list.add("Artur");
		System.out.println(list);
		
		aname.addAll(list);
		System.out.println(aname);
		System.out.println(list);
		
		aname.remove("Artur");
		System.out.println(aname);
		
		
	}

}
