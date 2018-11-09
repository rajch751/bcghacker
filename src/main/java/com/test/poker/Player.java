package com.test.poker;

import java.io.Serializable;
import java.util.List;

public class Player implements Serializable{
	
	List<Card> cards;

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	

	
	
	

}
