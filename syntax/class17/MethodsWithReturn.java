package com.syntax.class17;

public class MethodsWithReturn {
	public static void main(String[] args) {
	
		MethodsWithReturn obj =new MethodsWithReturn();
		boolean isItEven = obj.isEven(12);
		System.out.println(isItEven);
		
		obj.isEven(11);
		System.out.println(obj.isEven(11));
		
		
		String upperValue = obj.convertToUpperCase("Thao");
			System.out.println(upperValue);
	
}
	
		private String convertToUpperCase(String string) {
		// TODO Auto-generated method stub
		return null;
	}

		// Create a method that will accept an 
		//int value and return whether number is even
		boolean isEven(int a) {
			
			boolean even;
			if (a % 2 == 0) {
				even = true;
			}else {
				even = false;
			}
			return even;
		}

		//create a method that will accept 2 int values and
		//return the largest number
		int getLargest(int a, int b) {
			
			int largest;
			if(a > b) {
				largest = a;
			}else {
				largest = b;
			}
			return largest;//return values MUST be same type as Return that we declared in method
			
		}
			//create a method that will accept String value and returns
			//that value all in uppercase
			
		String convertToUpperCase1(String value) {
				return value.toUpperCase();
			}
			
			
			
		
			
			
			
			
			
			
			
			
		
		
}
