package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//let's create an Arraylist that will store numbers
		
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(100);
		alist.add(200);
		alist.add(300);
		//alist.add("400"); we CANNOT store string objects into ArrayList of Integer Objects
		
		System.out.println("Sizr of alist = "+alist.size());
		System.out.println(alist);
		
		alist.add(1);//3
		alist.add(2);//4
		alist.add(2);
		alist.add(2);
		alist.add(2);
		
		
		System.out.println(alist);
		
		alist.remove(3);// specifying index of elements to remove
		System.out.println(alist);
	}

}
