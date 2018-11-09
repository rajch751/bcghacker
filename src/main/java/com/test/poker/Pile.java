package com.test.poker;

import java.io.Serializable;

public class Pile implements Serializable {
	
	private Card card;
	private boolean validate=false;
	
	
	/**
	 * @param card
	 */
	public Pile(Card card) {
		super();
		this.card = card;
	}

	public synchronized Card getCard() throws InterruptedException {
		
		while(!validate) {
			wait();
		}
		System.out.println("Get the card from opponent"+card);
		validate=false;
		notify();
		return card;
	}

	public  synchronized void setCard(Card card) throws InterruptedException {
		
		while(validate) {
			
			wait();
		}
		this.card = card;
		validate=true;
		notify();
	}

}
