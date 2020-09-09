package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Create an arrayList of even numbers from 1 to 50. 
 * Remove any number that is divisible by 5 from that arrayList
 */
public class ArrayLIstOfEvenNumbers_2_Task {

	public static void main(String[] args) {
	

		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers +" ");

		Iterator<Integer> numbersIt = numbers.iterator();
		while(numbersIt.hasNext()) {
			Integer num =  numbersIt.next();
			if(num %  5 ==0) {
				numbersIt.remove();
			}
			
		}
		System.out.println(numbers +" ");
	}

}
