package com.test.poker;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Deck implements Serializable{
	
	//private ArrayList deck;
	
	public Deck(List<Card> deck) {
		//this.deck=new ArrayList();
	//	Object CardValue;
		for(int i=0;i<13;i++) {
			CardValue value=CardValue.values()[i];
			
			for(int j=0;j<4;j++)
			{
				Card card=new Card(Suit.values()[j],value);
				deck.add(card);
			}
		}
	}

}
