package com.syntax.class17;

public class ClassTaskOne {
//1 - Create a method createEmail(). 
//Based on values of users name, 
//lastName and email type, your 
//method should return complete email Address. Example:
//createEmail(John, Snow, gmail) → johnsnow@gmail.com
	String createEmail(String name, String lastName, String emailType) {
		String mail = name + lastName + "@" + emailType + ".com";
		return mail.toLowerCase();
	}
	
	
	
	
//	String createEmail(String a, String b, String c) {
//		String emailType;
//		
//		return emailType;
	}
	
	
	
	
	
	
	
	

