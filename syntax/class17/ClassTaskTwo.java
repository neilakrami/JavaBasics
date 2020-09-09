package com.syntax.class17;

public class ClassTaskTwo {
	 //2- write a method to return whether given number 
	//is prime or not?
 
//	boolean isPrime(int a) {
//		boolean prime;
//		
//		if(a % 2 != 0) {
//			prime = true;
//		}else {
//			prime = false;
//		}
//		return prime;
	//}
	
	public static final String System = null;

	boolean isPrime(int a) {
		boolean prime = true;
		if (a > 1) {
			for (int i = 2; i <= a / i; i++) {
				if (a % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}
		return prime;
	}
}
