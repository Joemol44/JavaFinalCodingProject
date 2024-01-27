package Week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
		this.hand = new ArrayList<Card>();
	}
	// Describe method
	public void describe() {
        System.out.println("Player " + this.name + " has the following cards");
        for (Card card : hand) {
            card.describe();
        }
    }
	// Flip method
	public Card flip() {
		return hand.remove(0);
	}
	// Draw method
	 public void draw(Deck deck) {
	        hand.add(deck.draw());
	    }
	//  Increment Score method
	 public void incrementScore() {
	        score++;
	    }
	 public int getScore() {
	        return score;
	    }
}
