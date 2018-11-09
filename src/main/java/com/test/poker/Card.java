package com.test.poker;

import java.io.Serializable;

public class Card implements Serializable{

	
	private Suit suit;
	private CardValue cardValue;
	/**
	 * @param suit
	 * @param cardValue
	 */
	public Card(Suit suit, CardValue cardValue) {
		super();
		this.suit = suit;
		this.cardValue = cardValue;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public CardValue getCardValue() {
		return cardValue;
	}
	public void setCardValue(CardValue cardValue) {
		this.cardValue = cardValue;
	}
	
	
}
