package com.syntax.class13;

public class Phone{

	
		String make;
		String model;
		String color;
		String proccesorSpeed;
		int year;
		
		
		void voiceCall() {
			System.out.println(make+" can voice call.");
			
		}
		void vedioCall() {
			System.out.println(make+ " can vedio call. ");
		}
		
		void MMSText() {
			System.out.println(make+" can send MMS Text.");
		}
		void picture() {
			System.out.println(make+" can take pictures.");
		}
}
