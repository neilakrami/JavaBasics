package com.syntax.class06;

public class HoursOfDay {

	public static void main(String[] args) {
		//if hour is between 1 - 11 --> morning
		//if hour is between 12 - 15 --> afternoon
		//if hour is between 16 - 20 --> evening
		//if hour is between 21 - 24 --> night
		//We will print: Right now it is ____
		
		int hour = 13;
		String dayTime;
		
		if(hour >= 1 && hour <= 11) {
			dayTime = "Morning";
			
		}else if(hour >= 12 && hour <= 15) {
			dayTime = "Afternoon";
			
		}else if(hour >= 16 && hour <=20) {
			dayTime = "Evening";
			
		}else if (hour >= 21 && hour <= 24) {
			dayTime = "Night";
			
		}else {
			dayTime = "Unkknown";
		}
// if it is unknow I don't want to print anything
		if(!dayTime.equalsIgnoreCase("unknown")) {
			
		}
		System.out.println("Right now it is " + dayTime);
	}

}
