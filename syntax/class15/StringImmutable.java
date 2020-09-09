package com.syntax.class15;

public class StringImmutable {

	public static void main(String[] args) {
		String str = "Today is a good day";//  new object gets created
		str = str.replace("good", "amazing");// new object gets created and that object
											//that object is assignmed to str
		System.out.println(str);
		
		str.concat("I love Sundays");// new object gets created but no one is referring to that objec
		
		System.out.println(str);//original str did not get changed
		
		str.toUpperCase();// new  object gets created but no one is referring to that object
		
		System.out.println(str);//original str did not get changed
		
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "Hello";
		String str5 = "Hello";
		
		str1.toUpperCase();// completely new String object is getting created
		str2 = str2.toLowerCase();
		System.out.println("value of str2 after assinging "+str2);
		System.out.println("value of str3 = "+ str3);
		System.out.println("value of str4 = "+str4);
		
		String str6 = new String ("Hello");
		
	}

}
