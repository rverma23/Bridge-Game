package org.bridge;

import org.bridge.enums.Suite;
import org.bridge.enums.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Deck {
    private final static List<Cards> deckOfCards = new ArrayList<>();

    public static void PutCardsInDeck() {
        for (Suite suite : Suite.values()) {
            for (Value value : Value.values()) {
                deckOfCards.add(new Cards(suite, value));
            }
        }
    }

    public static void Shuffle() {
        Collections.shuffle(deckOfCards);
    }

    public static Cards getCard() {
        return deckOfCards.removeFirst();
    }
}
