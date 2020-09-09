package com.syntax.class08;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		
		switch (browser.toLowerCase()) {
		 
		case "chrome":
			System.out.println("lunching chrome browser");
			break;
		case "firefox":
			System.out.println("lunching chrome browser");
			break;
		case "ie":
			System.out.println("lunching chrome browser");
			break;
		default:
			System.err.println("UnSupported browser.");
		}
		
		
	}

}
