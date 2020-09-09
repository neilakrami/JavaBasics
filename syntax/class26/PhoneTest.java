package com.syntax.class26;

public class PhoneTest{
	public static void main(String[] args) {
		//new Phone(); CE: we cannot create an object of Abstract class
		Phone iphone = new IPhone ();
		iphone.makCall();
		iphone.sendText();
		iphone.navigate();
		iphone.playMusic();
		
		System.out.println("----------------------------------------------");
		Phone samsung = new Samsung();
		samsung.makCall();
		samsung.sendText();
		samsung.navigate();
		samsung.playMusic();
}
}
