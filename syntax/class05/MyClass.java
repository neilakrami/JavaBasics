package com.syntax.class05;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		boolean a, b, c;
		a = b = c = true;
		
		if(!a || (b && c)) {
			System.out.println("If excuted");
		}else {
			System.out.println("else execueted");
		}
	}

}
