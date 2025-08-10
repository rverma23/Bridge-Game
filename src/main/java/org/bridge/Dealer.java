//RAHUL VERMA 
//STUDENT ID: 110134817
package org.bridge;

public class Dealer {
    public static void dealCards(Player player) {
        for (int i = 0; i < 13; i++) {
            player.addCardToHand(Deck.getCard());
        }
    }
}
