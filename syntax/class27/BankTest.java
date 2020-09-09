package com.syntax.class27;

public class BankTest {

	public static void main(String[] args) {
		
		System.out.println("----Object of trustable type------");
		Trustable boa = new BOA();
		boa.trust();
	
		System.out.println("----Object of Bank type------");

		Bank b = new BOA();
		b.trust();
		b.deposit();
		b.withdraw();
		
		System.out.println("---object of investments type------");

		Investments i = new BOA();
		i.doInvestements();
		
		System.out.println("-----object of BOA type---");
	
		BOA bb = new BOA();
		bb.trust();
		bb.deposit();
		bb.withdraw();
		bb.doInvestements();
		
	
	
		
	}

}
