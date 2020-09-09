package com.syntax.class28;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	

		
		//Let's create an ArrayList that will store numbers
		
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(100);//0
		alist.add(200);//1
		alist.add(300);//2
		
		//alist.add("400");--> we cannot store string objects into ArrayList of Integer objects
		
		System.out.println("Size of alist = "+alist.size());
		System.out.println(alist);
		
		alist.add(1);//3
		alist.add(2);//4
		alist.add(2);
		alist.add(2);
		alist.add(2);
		alist.add(2);
		
		System.out.println(alist);
		
		alist.remove(3);// specifying index of element to remove
		
		System.out.println(alist);
		
	}

}
