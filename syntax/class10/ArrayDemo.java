package com.syntax.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// Array is a tray of tea cups
		
		int num1 = 10;
		int num2 = 15;
		int num3 = 20;
		int num4 = 25;
		
		//declare and initialize one array of integers
		//Scanner scan = new Scanner();
		
		int[] numbers = new int[4];// index from 0 to 3
		
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		// this is wrong --> numbers[4]
		
		//access elements from the array
		System.out.println(numbers[3]);
		
		//if array is storing integers, when I get one element 
		//I will get one int
		int element0 = numbers[0];
		
		//We are just declaring, not initializing
		String[] carArray; // preferred way
		String carArray1[]; // works but not preferred
		
		//we are creating/initializing the array
		carArray = new String[3]; //The size is 3 ---> 0, 1, 2
		// storing cars
		carArray[0] = "BMW";
		carArray[1] = "Toyota";
		carArray[2] = "Benz";
		
		//carArray[4] = "Tesla";// runtime-error this one will give an exception as we don't have 4 car spaces
		
		String car = carArray[2];
		System.out.println(car);
		
		
		System.out.println("===========================");
		
		char[] letters = new char[4];
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';

		System.out.println("print before re-assignin " +letters[2]);
		// re- assigning another letter into spot with index 2
		letters[2] = 'K';
		
		System.out.println("print after re-assignin " +letters[2]);
	}
	
	
	

}
