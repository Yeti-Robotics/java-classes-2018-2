import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] deck = new Card[52];
    
    public Deck() {
        String[] suits = { "Spade", "Heart", "Club", "Diamond" };
        String[] names = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < names.length; j++) {
                int position = (i * names.length) + j;
                deck[position] = new Card(j + 1, names[j], suits[i]);
            }
        }
    }
    
    public Card[] getDeck() {
        return deck;
    }
    
    public void shuffle() {
        Random rng = new Random();
        for (int i = 0; i < deck.length; i++) {
            int currentPosition = i;
            int newPosition = rng.nextInt(deck.length);
            Card temp = deck[currentPosition];
            deck[currentPosition] = deck[newPosition];
            deck[newPosition] = temp;
        }
    }
    
    public Card[] dealPlayer1Cards() {
        return Arrays.copyOfRange(deck, 0, deck.length / 2);
    }
    
    public Card[] dealPlayer2Cards() {
        return Arrays.copyOfRange(deck, deck.length / 2, deck.length);
    }
}
