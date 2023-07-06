package WorkingWithAbstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String inputRank = scan.nextLine();
        String inputSuit = scan.nextLine();

        Card card = new Card(inputRank,inputSuit);

        System.out.printf("Card name: %s of %s; Card power: %d",
                Rank.valueOf(inputRank), Suit.valueOf(inputSuit), Rank.valueOf(inputRank).power +
                        Suit.valueOf(inputSuit).suitPower);

    }

    enum Rank  {
        ACE (14),
        TWO (2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

         private final int power;

        Rank(int power) {
            this.power = power;
        }

    }

    enum Suit {

        CLUBS(0),
        DIAMONDS(13),
        HEARTS(26),
        SPADES(39);

       private final int suitPower;
        Suit(int suit) {
            this.suitPower = suit;
        }
    }

    public static class Card{
        Rank rank;
        Suit suit;
        public Card(String rank, String suit) {
            this.rank = Rank.valueOf(rank);
            this.suit = Suit.valueOf(suit);
        }

        public Rank getRank() {
            return rank;
        }

        public void setRank(Rank rank) {
            this.rank = rank;
        }

        public Suit getSuit() {
            return suit;
        }

        public void setSuit(Suit suit) {
            this.suit = suit;
        }

    }
}
