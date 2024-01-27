package Week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	Deck(){
		// List of Cards Constructor
		String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", 
						  "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				Card card = new Card(i + 2, names[i] + " of " + suit);
				this.cards.add(card);
				
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
		
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	// Shuffle to randomize the cards
	public void shuffle() {
		Collections.shuffle(cards);
	}
	// Draw to remove and return the top card of the Cards field
	public Card draw() {
			return cards.remove(0);
	}
	
	}


