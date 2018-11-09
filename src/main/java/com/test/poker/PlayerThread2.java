package com.test.poker;

import java.util.List;

public class PlayerThread2 implements Runnable {
	
	private Pile p;
	private Player p2;
	/**
	 * @param p
	 * @param p2
	 */
	public PlayerThread2(Pile p, Player p2) {
		super();
		this.p = p;
		this.p2 = p2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		List<Card> ls=p2.getCards();
		int count=0;
		while(true) {
			
			for(int i=0;i<ls.size();i++) {
				
				Card c=ls.get(i);
				
				try {
					Card p1=p.getCard();
					//p.setCard(c);
					System.out.println("Player 1 card"+p1);
					System.out.println("Player 2 Card"+c);
					
					if(p1.getCardValue().getCardVal()==c.getCardValue().getCardVal()) {
						System.out.println("Match Value Found"+count++);
					}
					
					boolean checkDiamond=p1.getSuit().toString().equals("DIAMONDS");
					boolean checkDiamon2=c.getSuit().toString().equals("DIAMONDS");
					
				    if(checkDiamond==checkDiamon2) {
				    	System.out.println("Match Suit Found"+count++);
				    }
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	

}
