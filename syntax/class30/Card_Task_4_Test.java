package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class Card_Task_4_Test {

	public static void main(String[] args) {
		
		LinkedList<Card_Task_4> cards = new LinkedList<>();
		
		cards.add(new CitiBank("Citi Rewards"));
		cards.add(new USBank("US Bank Cash+"));
		cards.add(new ChessBank("Chass Sapphire"));
		
		System.out.println("-------- Using for loop-------");
		
		for(int i=0; i< cards.size(); i++) {
			cards.get(i).applyCreditCard();
			cards.get(i).payBill();
			System.out.println();
			
		}
		System.out.println("----using advanced forloop--------");
		for(Card_Task_4 card:cards) {
			card.applyCreditCard();
			card.payBill();
			System.out.println();
		}
		
		System.out.println("-------Using Iterator--------");
		Iterator<Card_Task_4> cardIt =cards.iterator();
		while(cardIt.hasNext()) {
			Card_Task_4 car = cardIt.next();
			car.applyCreditCard();
			car.payBill();
			System.out.println();
		}

	}

}
