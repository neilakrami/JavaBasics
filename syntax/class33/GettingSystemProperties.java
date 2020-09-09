package com.syntax.class33;

public class GettingSystemProperties {

	public static void main(String[] args) {
		//Users/neilamrami/eclipse-workspace/JavaBasics101/configs/Examples.properties
		String username = System.getProperty("user.name");
		System.out.println(username);
		
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		String directory = System.getProperty("user.dir");
		System.out.println(directory);

		String filePath = System.getProperty("user.dir")+"/configs/Examples.properties";
		System.out.println(filePath);
	}

}
