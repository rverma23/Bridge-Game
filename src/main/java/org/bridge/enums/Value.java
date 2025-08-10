package  org.bridge.enums;

public enum Value {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9),
    TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

    private final int value;

    Value(int value) {
        this.value = value;
    }

    public String getStringValue() {
        switch (value) {
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "J"; // Jack
            case 12:
                return "Q"; // Queen
            case 13:
                return "K"; // King
            case 14:
                return "A"; // Ace
            default:
                throw new IllegalArgumentException("Invalid value: " + value);
        }
    }
}
