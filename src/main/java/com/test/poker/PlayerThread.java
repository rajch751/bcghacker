package com.test.poker;

import java.util.List;

public class PlayerThread implements Runnable {
	
	
	private Pile p;
	private Player p1;
	
	

	/**
	 * @param p
	 */
	public PlayerThread(Pile p,Player p2) {
		super();
		this.p = p;
		this.p1=p2;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		List<Card> ls=p1.getCards();
		
		while(true) {
		 
		for(int i=0;i<ls.size();i++) {
			
			Card c=ls.get(i);
			try {
				p.setCard(c);
				System.out.println("Playe places the card"+p);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
	}

}
