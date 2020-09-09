package com.syntax.class10;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] groupq = {"Ali", "Kasnia", "olga", "Castro"};
		
		String[] group1 = new String[5];
		
		group1[3] = "Kamila";
		group1[1] = "Elshan";
		group1[4] = "Yuriy";
		
		System.out.println(group1[0]);
		System.out.println(group1[1]);
		
		int arrLength = group1.length;
		System.out.println("The length of the array is:" +arrLength);
		
		//HW Create an array of 4 integers and see the defualt values
	}

}
