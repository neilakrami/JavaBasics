package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we  created an array and stored the initial values
		String[] weekdays = {"Monday", "Tuesday", "Wednesday","Thuersda", "Friday",};
		
		//Let us print the element with index 3
		System.out.println(weekdays[3]);
		
		weekdays[3] = "Thuersday";
		System.out.println(weekdays[3]);
		
		// we cannot add elements to the array
		//weekdays[5] = "Saturday";
		
		//1st more
		
		double[] bankBalances = {10000, 23.50, 5540.5};
		
		System.out.println("totale money is " +(bankBalances[0]+bankBalances[1]+bankBalances[2]));
		
		//2nd way
		int total =  (int) bankBalances[0]+(int)bankBalances[1]+(int)bankBalances[2];
		
		System.out.println("total is: " + total);
		
		//3rd way
int total1 =  (int) (bankBalances[0]+bankBalances[1]+bankBalances[2]);
		
		System.out.println("total is: " + total1);
		
		//don't ever create an array with 0 elements
		//becaus you cannot add elements later
		
		int[] numbers1 = new int[0];
		int[] numbers2= {};
		numbers2[0] = 5;
		System.out.println(numbers2[0]);
		
	}

}
