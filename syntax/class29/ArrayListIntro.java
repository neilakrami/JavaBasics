package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<>();
		//to add values to the arraylist
		arrayList.add("hello");//0
		arrayList.add("welocme");//1
		arrayList.add("How are you");//2
		
		System.out.println("Original arrayList "+arrayList);
		
		//how many elements inside my ArrayList
		int arrayListSize=arrayList.size();
		System.out.println("Size of original arrayList + "+arrayListSize);
		
		
		//how to access elements form ArrayList
		String elementIndex2=arrayList.get(2);
		System.out.println(elementIndex2);
		
		
		
		//I would like to add more objects into ArrayList
		arrayList.add("Good Bye");
		arrayList.add("Thank you");
		
		System.out.println("Size of Arraylist after adding more String Objects = "+arrayList.size());
		System.out.println("-------ArrayList after adding more string objects "+arrayList);
		
		//let's remove "Hello";
		arrayList.remove(0);
		
		System.out.println("Size of Arraylist after revomeing Object = "+arrayList.size());
		System.out.println("-------ArrayList after removing "+arrayList);
		
		//I want to update value "Good Bye --> "Bye";
		arrayList.set(2, "Bye");
		System.out.println(arrayList);
		System.out.println("-------ArrayList after replacing string object "+arrayList);
		
	}
	

}
