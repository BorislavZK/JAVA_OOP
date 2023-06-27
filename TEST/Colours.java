package TEST;

public enum Colours {

    RED(11, 12),
    GREEN(2, 2),
    BLUE(3, 3);

    public final int value;
    public final int secondValue;

    Colours(int value, int secondValue) {
        this.value = value;
        this.secondValue = secondValue;
    }

    public int getValue() {
        return value;
    }

    public int getSecondValue() {
        return secondValue;
    }


    enum SecondaryColours {

        YELLOW ("Yellow color", 55, 33),
        CYAN ("Cyan color", 66, 77);

        private final String name;
        private final int firstComponent;
        private final int secondComponent;

        SecondaryColours(String name, int firstComponent, int secondComponent) {
            this.name = name;
            this.firstComponent = firstComponent;
            this.secondComponent = secondComponent;
        }
    }
}

