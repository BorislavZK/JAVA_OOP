package WorkingWithAbstraction.CardSuit;

public class Main {


    public static void main(String[] args) {

        System.out.println("Card Suits:");
        for (Suit s : Suit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s", s.ordinal(), s.name());
            System.out.print(System.lineSeparator());
        }
    }
}
