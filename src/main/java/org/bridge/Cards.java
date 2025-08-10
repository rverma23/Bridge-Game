package org.bridge;

import org.bridge.enums.Suite;
import org.bridge.enums.Value;

public class Cards {
    private final Suite suite;
    private final Value value;
    public Cards(Suite suite, Value Suit) {
        this.suite = suite;
        this.value = Suit;
    }
    public Suite getSuite() {
        return suite;
    }
    public Value getValue() {
        return value;
    }
}