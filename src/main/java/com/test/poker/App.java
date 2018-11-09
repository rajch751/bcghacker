package com.test.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<Card> deck = new ArrayList<>();
		// List<Card> playCard1=new ArrayList<>();
		//List<Card> playCard2 = new ArrayList<>();
		Player p1 = new Player();
		Player p2 = new Player();

		Deck d = new Deck(deck);

		Collections.shuffle(deck);

		List<Card> playCard1 = IntStream.range(0, deck.size()).filter(i -> i % 2 == 0)
				.mapToObj(i -> deck.get(i)).collect(Collectors.toList());
		
		List<Card> playCard2 =IntStream.range(0, deck.size()).filter(i -> i % 2 != 0)
				.mapToObj(i -> deck.get(i)).collect(Collectors.toList());
		
		p1.setCards(playCard1);
		p2.setCards(playCard2);
		System.out.println("========================");
		System.out.println("SHUFFLED CARDS");
		System.out.println("========================");
		deck.stream().forEach(dk->{
			//int i=0;
			System.out.println(dk.getCardValue()+"_"+dk.getSuit());
		});
		System.out.println("========================");
		System.out.println("PLAYER 1 CARDS");
		System.out.println("========================");
		playCard1.stream().forEach(dk->{
			System.out.println(dk.getCardValue()+"_"+dk.getSuit());
		});
		System.out.println("========================");
		System.out.println("PLAYER 2 CARDS");
		System.out.println("========================");
		playCard2.stream().forEach(dk->{
			System.out.println(dk.getCardValue()+"_"+dk.getSuit());
		});
		

		//PlayerThread p=new PlayerThread(null, p2);
		
		

	}
}
