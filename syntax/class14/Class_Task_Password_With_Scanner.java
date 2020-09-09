package com.syntax.class14;

import java.util.Scanner;

public class Class_Task_Password_With_Scanner {

	public static void main(String[] args) {
		
	/* Accept username , password and confirm password from a user and check following requirements:
	 * 
	 * 1. Username and Password cannot be empty, if so -> message = "Username and Password cannot be empty"
	 * 2. Password should be minimum 8 characters, if less -> message = "Password is too short".
	 * 3. Password cannot contain username if so, -> message = "Password cannot contain username".
	 * 4. Password should match confirmed password, if not  -> message = "Password don not match".
	 */
//Only after all requirements met -> message "Your username and password has been created".
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter Username");
		String username = scan.next();
		
		System.out.println("Please enter your password");
		String password = scan.next();
		
		
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
			
		}else {
			if(password.length() > 8) {
				
				if(!password.contains(username)){
					
					System.out.println("Please confirm your password");
					String confirmedPwd = scan.nextLine();
					
					if(password.equals(confirmedPwd)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Password do not match");
					}
					
				}else {
					System.out.println("Password cannot cantain username");
				}
			}else {
				System.out.println("password is too short");
			}
		}
	}

}
