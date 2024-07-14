public class Card {

    public enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
    
        private final int value;
    
        Rank(int value) {
            this.value = value;
        }
    
        public int getValue() {
            return value;
        }    
    }

    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES;    
    }

    private Rank rank;
    private Suit suit;
    private String name;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.name =rank.name() + " of " + suit.name();
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        // return rank + " of " + suit;
        return name;
    }
}

//        a.      Card

// i.     Fields

// 1.     value (contains a value from 2-14 representing cards 2-Ace)

// 2.     name (e.g. Ace of Diamonds, or Two of Hearts)

// ii.    Methods

// 1.     Getters and Setters

// 2.     describe (prints out information about a card)