
public class Player {
    public String name;
    public Card[] cards;
    public int score;
    
    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public String toString() {
        return name + "'s score is " + score;
    }
}
