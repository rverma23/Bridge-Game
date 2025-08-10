package org.bridge.enums;

public enum Suite {
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    SPADES("Spades");

    private final String name;

    Suite(String name) {
        this.name = name;
    }

    public String getUnicodeValue() {
        switch (this.name) {
            case "Hearts":
                return "\u2661";
            case "Diamonds":
                return "\u2662";
            case "Clubs":
                return "\u2663";
            case "Spades":
                return "\u2660";
            default:
                throw new IllegalArgumentException("Unknown suit: " + this.name);
        }
    }

    public String getName() {
        return name;
    }
}
