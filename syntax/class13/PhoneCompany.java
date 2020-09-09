package com.syntax.class13;

public class PhoneCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone iPhone = new Phone();
		iPhone.make = "iphone";
		iPhone.model = "Max Pro";
		iPhone.color = "White";
		iPhone.year = 2019;
		iPhone.proccesorSpeed = "2.65";
		System.out.println("The first phone is "+iPhone.make+
				", and model is "+iPhone.model+", it is in "
				+iPhone.color+" color,  year is "+iPhone.year+
				", and proccesor speed is "+iPhone.proccesorSpeed+" GHz"+ ".");
		iPhone.vedioCall();
		iPhone.voiceCall();
		iPhone.MMSText();
		iPhone.picture();
		
		System.out.println();
		System.out.println();
		Phone Android = new Phone();
		Android.make = "Android";
		Android.model = "Galaxy S10";
		Android.color = "Black";
		Android.year = 2020;
		Android.proccesorSpeed = "2X2.73";
		System.out.println("The second phone is "+Android.make+
				", and model is "+Android.model+", it is in "
				+Android.color+" color,  year is "+Android.year+
				", and proccesor speed is "+Android.proccesorSpeed+" GHz"+ ".");
		Android.vedioCall();
		Android.voiceCall();
		Android.MMSText();
		Android.picture();
		
		System.out.println();
		System.out.println();
		Phone Nokia = new Phone();
		Nokia.make = "Nokia";
		Nokia.model = "Nokia 7";
		Nokia.color = "Red";
		Nokia.year = 2018;
		Nokia.proccesorSpeed = "1.8";
		System.out.println("The thired phone is "+Nokia.make+
				", and model is "+Nokia.model+", it is in "
				+Nokia.color+" color,  year is "+Nokia.year+
				", and proccesor speed is "+Nokia.proccesorSpeed+" GHz"+ ".");
		Nokia.vedioCall();
		Nokia.voiceCall();
		Nokia.MMSText();
		Nokia.picture();
	}

}
