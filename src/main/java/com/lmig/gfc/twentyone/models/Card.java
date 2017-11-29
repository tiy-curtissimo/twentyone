package com.lmig.gfc.twentyone.models;

public abstract class Card {
	
	private Suits suit;
	
	public Card(Suits suit) {
		this.suit = suit;
	}

	public Suits getSuit() {
		return suit;
	}

	public abstract String getFace();

	public abstract int getValue();

}
