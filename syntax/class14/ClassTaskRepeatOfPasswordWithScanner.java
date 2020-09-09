package com.syntax.class14;

import java.util.Scanner;

public class ClassTaskRepeatOfPasswordWithScanner {

	public static void main(String[] args) {
	//Password withSCannerClass
		Scanner scan = new Scanner(System.in);
		System.out.println("Plase enter your  username: ");
		String username = scan.nextLine();
		
		System.out.println("Please enter your password:");
		String password = scan.nextLine();
		
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else {
			if(password.length() > 8) {
				
				if(!password.contains(username)) {
					System.out.println("Please confirm your password");
					String confirmPassword = scan.nextLine();
					
					if (password.equals(confirmPassword)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Password don not match");
					}
					
				}else {
					System.out.println("Password cannot coontain username");
				}
				System.out.println("will continue checking");
				
			}else {
				System.out.println("Password is too short");
			}
		}
		
	}

}
