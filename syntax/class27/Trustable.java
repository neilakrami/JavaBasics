package com.syntax.class27;

public interface Trustable {

	void trust();
}
interface Bank extends Trustable{
	
	void deposit();
	void withdraw();
}

 abstract class PNC extends Mortgate implements Bank, Investments{
	
	public void deposit() {
		 System.out.println("PNC bank takes deposits");
	 }
	public void withdraw() {
		System.out.println("PNC gives you your money");
	}
	public void trust() {
		System.out.println("You can trust PNC with your money");
	}
	public void giveMortgage() {
		System.out.println("PNC gives Mortgage");
	}
	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
	}
	
}
 
 class BOA implements Bank, Investments{
		
		public void deposit() {
			System.out.println("BOA can deposit");
		}
		
		public void withdraw() {
			System.out.println("BOA can withdraw");
		}
		public void trust() {
			System.out.println("You can trust BOA");
		}

		public void doInvestements() {
			System.out.println("You can inest your money with BOA");
		}
 }