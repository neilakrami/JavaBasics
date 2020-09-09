package com.syntax.class19;

public class Class_Task_1_SumOfArray {

	/* Create a method that will accept an array 
	 * as parameters and will return a sum of all 
	 * elements from that array. Method should be 
	 * visibly only within same package and accessible 
	 * by the creating an instance of the class.protcted/default 
	 */
	
	
	protected int printSum(int[] array) {
		int total = 0;
		for (int element : array) {
			total = total + element;
		}
		System.out.println(total);
		return total;
	}
	public static void main(String[] args) {
		Class_Task_1_SumOfArray numbers = new Class_Task_1_SumOfArray();
		int[] arr = { 5, 5, 5, 5 };
		numbers.printSum(arr);
}
// different way
	public class task {
		public void main(String[] args) {
			// TODO Auto-generated method stub
			int[] numbers= {1,2,3,4};
			System.out.println(sum(numbers));
			
			task obj=new task();
			String text="Today is a great day";
			
			System.out.println(reverse(text));
			
			
		}
		
		
		
		static int sum(int[]a) {
			int size= a.length;
			int sum=0;
			for(int i=0;i<size;i++) {
				sum+=i;
			}
			return sum;
		}
		
		public static StringBuffer reverse(String a) {
			String str=a;
			StringBuffer strb= new StringBuffer(str);
			 return strb.reverse();
			
			}
	}
}
