package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * 
Create a property file to store following configurations:

browser=chrome
url=https://facebook.com
username
password

Read file and extract values of browser & url

 */
public class ReadingPropertyFacebook {

	public static void main(String[] args) throws IOException {
	
///Users/neilamrami/eclipse-workspace/JavaBasics101/configs/Facebook.properties
		String filePath = "configs/Facebook.properties";
		
		FileInputStream file = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(file);
		
	}

}
