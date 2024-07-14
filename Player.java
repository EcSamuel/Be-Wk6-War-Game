import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;
    private int score;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    public int getHandSize() {
        return hand.size();
    }

    public void draw(Card card) {
        hand.add(card);
    }

    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(hand.size() - 1);
        }
        return null;
    }

    public void incrementScore() {
        score++;
    }

    public void describe() {
        System.out.println("Player: " + name + " - Score: " + score);
        System.out.println("Hand size: " + hand.size());
    }

    @Override
    public String toString() {
        return "Player: " + name + " - Hand size: " + hand.size() + " - Score: " + score;
    }
}