package com.syntax.class15;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer strBuffer = new StringBuffer("Hello");//is mutable object
		strBuffer.append(" friends");// when we perform operation it happens on same object and NO NEW object gets created
		System.out.println(strBuffer);

		
		//Immutable string
		String str2 = "Hello";// String is Immutable object=not changeable 
		str2.concat( " friends");//new object gets created that will have value  "Hellow friends"---> no one takes it
		
		System.out.println(str2);//Hello
		
	}
}
