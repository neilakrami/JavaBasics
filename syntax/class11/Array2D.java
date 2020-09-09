package com.syntax.class11;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = new int[3][4];//[rows][columns]
		//1st row
		numbers[0][0] = 10;
		numbers[0][1] = 15;
		numbers[0][2] = 20;
		numbers[0][3] = 255;
		
		//2nd row, row with index 1
		numbers[1][0] = 32;
		numbers[1][1] = 36;
		numbers[1][2] = 40;
		numbers[1][3] = 44;
//		numbers[1][4] = 48; runtime error, Out of bounds exception
		
		//3rd row, row with index 2
		
		numbers[2][0] = 63;
		numbers[2][1] = 66;
		numbers[2][2] = 69;
		numbers[2][3] = 72;
		
		
		// print number 20
		System.out.println(numbers[0][2]);
		
// 	If we know the values upfront
		int[][] nums = { 
				{10, 15, 20, 25},
				{32, 36, 40, 44},
				{63 ,66, 69, 72},	
		};
		System.out.println(nums[2][0]); //63
		System.out.println(nums[1][3]);//44
		
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			for (int i = 0; i < a.length; i++){
			  for (int j = 0; j < a[i].length; j++){
			      System.out.print(a[i][j]+" ");
			  }
			 System.out.println();
			}
	}
	

}
