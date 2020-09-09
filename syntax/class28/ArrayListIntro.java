package com.syntax.class28;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("Hello");//0
		arrayList.add("Welcome");//1
		arrayList.add("How are you");//2
		
		System.out.println("-------- orginal arraylist "+arrayList);
		
		//how many elements inside my ArrayList?
		
		int arraListSize = arrayList.size();
		System.out.println(arraListSize);
		
		//how to access elements from ArrayList
		
		String elementsIndex= arrayList.get(2);
		System.out.println(elementsIndex);
		
		//I would like to add more Objects into ArrayList
		arrayList.add("Good Bye");//3
		arrayList.add("Thank you");//4
		
		System.out.println("Size of ArrayList after adding more String objects ="+ arrayList.size());
		System.out.println("-------- ArrayList after  adding more string objectgs "+arrayList);
		
		//let's remove "Hello";
		arrayList.remove(0);
		
		System.out.println("Size of arraylist after removing object "+ arrayList.size());
		System.out.println("----------- ArrayList after removing Objec "+arrayList);
		
		//I want to update value "Good Bye" ----> "Bye";
		
		arrayList.set(2, "Bye");
		System.out.println("-----------  ArrayList after replacing object "+ arrayList);
	}

}
