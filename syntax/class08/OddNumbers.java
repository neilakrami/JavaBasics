package com.syntax.class08;

public class OddNumbers {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		
		for(int i = 20; i <= 50; i++) {
			
		
			if (i % 2 == 0){ 
			
			System.out.print(i);
		} 

	}
		System.out.println("========2nd way===========");
		
		for (int i = 21 ; i <=50; i += 2) {
			System.out.println(i);
		}
		
System.out.println("========2nd way===========");
		//for (int j = 5 ; j > 0; j--) same

		for (int j = 5 ; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("========What is the result?===========");
		
	int total = 1;
	for (int k = 1; k <= 4; k++) {
		total = total + k;
		System.out.println(total);
	}
	System.out.println("========What is the result?===========");
	
	//
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}