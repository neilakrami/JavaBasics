package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		// Do while execute the code first then it check the condition
		// while check the condition first then execute
		
		
		
		int x =11;
		while (x <= 5){ // checks before going into the loop
			System.out.println("Hello");
			x++;
		}
		
		System.out.println("-------Using Do While loop---------");
		int y = 11;
		do {
			System.out.println("Hello");
			y++;
		}while ( y <= 3);// checks after going into the loop
		
		//while checks if soup is hot, before eating
		//do while check if soup is hot, after eating soup
		//with do while loop you will get burn!!!!!!
		
	}

}
