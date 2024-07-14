import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
        System.out.println("Total Cards Created: " + cards.size());
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }

    public int remainingCards() {
        return cards.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}


    // public static void main(String[] args) {
    //     Deck deck = new Deck();
    //     System.out.println("Deck before shuffling:");
    //     System.out.println(deck);

    //     deck.shuffle();
    //     System.out.println("Deck after shuffling:");
    //     System.out.println(deck);

    //     System.out.println("Dealing cards:");
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println(deck.deal());
    //     }

    //     System.out.println("Remaining cards in the deck:");
    //     System.out.println(deck.remainingCards());
    // }


// b.     Deck

//          i.     Fields

//                          1.     cards (List of Card)

//                ii.    Methods

//                          1.     shuffle (randomizes the order of the cards)

//                          2.     draw (removes and returns the top card of the Cards field)

//                          3.     In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
