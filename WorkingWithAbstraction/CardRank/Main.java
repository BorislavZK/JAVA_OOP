package WorkingWithAbstraction.CardRank;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");
        for (Rank r : Rank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s", r.ordinal(), r.name());
            System.out.print(System.lineSeparator());
        }

    }
    enum Rank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }
}
