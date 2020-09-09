package com.syntax.class17;

public class MoreMethods {
	
	
	public static void main(String[] args) {
		
		
		MoreMethods obj= new MoreMethods();
		
		int[] array = {56, 46, 23, 90};//you can put any array
		
		int large = obj.largestFromArray(array);
		System.out.println(large);
		
		String[] words = obj.getWords("Good night friends");
		
		for(String word : words) {
			System.out.println(word);
			
		}
		
		
	}
	//create a method that should return the 
	//largest number from an array
	int largestFromArray(int[] array) {
		
		int largest = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
			
			
		}
		return largest;
	}

		//Create a method that will accept a String 
		//and return words from that string
		//Hello World, Good night friends
	 
		String[] getWords(String str){
			return str.split(" ");
			
		}
}
