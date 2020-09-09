package com.syntax.class30;
/*Create a Card class that will have implemented  
 * and unimplemented methods and a constructor that
 *  will initializes credit card type.  Create 3 subclasses of a Card card. 
 *  Create 3 objects of different card and store them into LinkedList. 
 *  Using for loop/advanced for loop/ iterator access all methods of the class.
 * 
 */
public abstract class Card_Task_4 {

	String creditCardType;
	
	public Card_Task_4(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	
	public void applyCreditCard() {
		System.out.println("You can apply for credit card online");
	}
	public abstract void payBill();
}



class CitiBank extends Card_Task_4{
	public CitiBank(String creditCardType) {
		super(creditCardType);
	}

	public void ApplyCreditCard() {
		System.out.println("You can apply for "+creditCardType +" Online");
	}
	@Override
	public void payBill() {
		System.out.println("Pay your bills with CitiBank "+creditCardType);
		
	}
}
class USBank extends Card_Task_4{

	public USBank(String creditCardType) {
		super(creditCardType);
		
	}

	public void ApplyCreditCard() {
		System.out.println(creditCardType+" card is easy to apply for.");
	}
	@Override
	public void payBill() {
		System.out.println("You can pay your bills with "+creditCardType);
		
	}
}
class ChessBank extends Card_Task_4{

		public ChessBank(String creditCardType) {
			super(creditCardType);
			
		}

		public void ApplyCreditCard() {
			System.out.println(creditCardType+" card is easy to apply for.");
		}
		@Override
		public void payBill() {
			System.out.println("You can pay your bills with "+creditCardType);
	
}
	
}




