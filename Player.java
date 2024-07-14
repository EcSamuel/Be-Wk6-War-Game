import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;
    private List<Card> playArea;
    private int score;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.playArea = new ArrayList<>();
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public List<Card> getPlayArea() {
        return playArea;
    }

    public int getScore() {
        return score;
    }

    public void addToHand(Card card) {
        hand.add(card);
    }

    public Card flip() {
        if (!hand.isEmpty()) {
            Card card = hand.remove(hand.size() - 1);
            playArea.add(card);
            return card;
        }
        return null;
    }

    public void draw(Deck deck) {
        Card card = deck.deal();
        if (card != null) {
            hand.add(card);
        }
    }

    public void incrementScore() {
        score++;
    }

    public void describe() {
        System.out.println("Player: " + name + " - Score: " + score);
        System.out.println("Hand: ");
        for (Card card : hand) {
            System.out.println("  " + card);
        }
    }

    @Override
    public String toString() {
        return "Player: " + name + " - Hand size: " + hand.size() + " - Score: " + score;
    }
}