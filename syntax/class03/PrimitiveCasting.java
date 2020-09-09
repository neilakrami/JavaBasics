package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//widening, explicity casting, automatically
		// double d = (double) 7;
		
		double d = (double) 7;
		System.out.println(d);
	//int i = 7.58; // compile time error -> 
	//Type mismatch: cannot convert from double to in
	//double to int

	//narrowing  (explicit casting, manually)

		int i = (int) 7.58;
		System.out.println(i);
		
	//narrowing a large number into a byte
		byte b = (byte)123865;
		System.out.println(b);
	
	//Narrowing/explicitly/manually
	//you are trying to fit something 
	//from a bigbox into a smallpox
		
		long l1 = 45;
		int number1 = (int) l1;
		System.out.println("Number1 = "  +number1);
		
		
		long l2 = 234566889;
		int number2 = (int)l2;
		System.out.println(number2);
	}

}
