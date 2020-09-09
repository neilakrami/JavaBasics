package com.syntax.class12;

public class Q2_PrimeNumber {

	public static void main(String[] args) {
	// Interview  Q2 prime number
	// prime number is greater than 1
	// prime number is only divisible by 1 and itself
	//2 divisible (1, 2) prime
	//3 divisible (1, 3) prime
	//4 divisible (1, 2, 3) not prime
	//5 divisible (1, 5 ) prime
	// 6 divisible ( 1, 2, 3, 6)not prime;
		
		
		int number  = 49; // not prime
		boolean prime = true;
		 
		if (number > 1) { // I will check
			// try to divide it by 2, 3, 4, 5, 6 ... 29383
			//two way For(int i = 2; i <= number -1; i++)
			for( int i = 2; i < number; i++) {
				if(number %  i == 0) {
					prime = false;
					break;
				}
			}
							
		}else {
			prime = false;
			
		}
		// This was corrct!
		//Can we improve it?
		//1st improvement, try to divide it until number/2
		//2nd improvement, try to divide it until /i
	if (number > 1) {
			for(int i = 2; i < number/i; i++) {
				System.out.println("try to divide " + i);
				
			}
		}else {
			prime = false;
		}
		
		System.out.println("Then number " + number + " is prime "+ prime);
		
	
		
	}

}
