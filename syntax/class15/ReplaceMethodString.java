package com.syntax.class15;

public class ReplaceMethodString {

	public static void main(String[] args) {
		
		//Replacing all character from A-Z
		
		String me = "I am a good tester. I am a good person";
		
		String str = "Hello";
		
		str = str.replace('e', 'E');
		System.out.println(str);
		
		me = me.replace("good", "Best");
		System.out.println(me);
		
		me = me.replace("we", "us"); //if it find it --> replace if it will not find-->does nothing
		System.out.println(me);
		
		String fromApplication = "Phone number is 123456780";
		fromApplication = fromApplication.replaceAll("[A-Z]", "");// A-Z upper case
	System.out.println(fromApplication);//hone number is 123456780

	
	//replacing all charecters from a-z small
	fromApplication = fromApplication.replaceAll("[a-z]", "").trim();// this one trim also can do short way
	System.out.println(fromApplication); //
	
//	fromApplication = fromApplication.trim(); this way we can trim too
//	System.out.println(fromApplication);
	
	
	String another = "Hellow12345";
	another = another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
	System.out.println(another);
	
	String anotherWay = "Helloyyoiuoiuouo79797978";
	anotherWay = anotherWay.replaceAll("[A-Za-z]", "");//79797978
	System.out.println(anotherWay);
			
	
	//replacing all numbers form strings [0-9], if specific [0-5]
	String mix = "Hellow76588 friends 0986886";
	mix = mix.replaceAll("[6-9]", "");//Hello friends 
	System.out.println(mix);
	
	String mix1 = "hello &*##%";
	mix1 = mix1.replaceAll("[^A-Za-z0-9]",  "");
	System.out.println(mix1);
	
	
	
	
	}

}
