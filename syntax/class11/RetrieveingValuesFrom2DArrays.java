package com.syntax.class11;

public class RetrieveingValuesFrom2DArrays {

	public static void main(String[] args) {
		// Put the months for each season ino ne row
		
		String[][] months = {
							 { "December", "January", "February"},
							 { "March", "April","May"},
							 { "June", "July", "August"},
							 { "September", "October", "November"}
							};
		//Nested loops are married to 2D Arrays
		
		int rows = months.length;  //How many arrays/rows are inside, how many rows?
	
		System.out.println(rows + " Seasons");
		
		int winterLength = months[0].length; // how many elements.columns are in row with index 0 ?
		System.out.println(winterLength + " Months in winter / row 0");
		
		int lastRowSize = months[rows - 1].length;
		
		for (int i = 0; i < months.length; i++) {// iterating over rows
			
			for (int j = 0; j < months[i].length; j++) { // iterating over columns
				 
						System.out.print(months[i][j] +", ");
			}
			
			System.out.println();
			System.out.println();
		}
	
	}

}
