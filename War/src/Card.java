
public class Card {
    public int rank;
    private String name;
    private String suit;
    
    
    public Card(int rank, String name, String suit) {
        this.rank = rank;
        this.name = name;
        this.suit = suit;
    }
    
    public String toString() {
        return name + " of " + suit;
    }
}
