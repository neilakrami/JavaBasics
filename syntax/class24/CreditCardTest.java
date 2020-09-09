package com.syntax.class24;

public class CreditCardTest {
	public static void main(String[] args) {
		
		CreditCard credit = new CreditCard(2000, 0.2);
		credit.interestedCharge();
		
		Visa visa = new Visa(1000,0.2);
		System.out.println(visa.interestedCharge());
		
		AX ax = new AX(200, 0.4);
		System.out.println(ax.interestedCharge());
	}

}
