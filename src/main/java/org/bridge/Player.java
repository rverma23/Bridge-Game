package org.bridge;

import org.bridge.enums.PlayerType;
import org.bridge.enums.Suite;

import java.util.*;

public class Player {
    private final String name;
    private final PlayerType playerType;
    private final List<Cards> hand;
    private final String team;

    public Player(String name, PlayerType playerType, String team) {
        this.name = name;
        this.playerType = playerType;
        this.hand = new ArrayList<>();
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public List<Cards> getHand() {
        return hand;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public String getTeam() {
        return team;
    }

    public void addCardToHand(Cards card) {
        hand.add(card);
        if (hand.size() == 13) {
            hand.sort(Comparator
                    .comparingInt((Cards a) -> a.getSuite().ordinal())
                    .thenComparingInt(a -> a.getValue().ordinal()));
        }
    }

    public Cards playCard(Suite suite) {
        Cards cardToPlay;
        if (playerType.equals(PlayerType.AI)) {
            if (suite == null) {
                // AI logic to play any card - highest value
                cardToPlay = hand.stream()
                        .max(Comparator.comparingInt(a -> a.getValue().ordinal()))
                        .orElse(null);
                hand.remove(cardToPlay);

            } else {
                // AI logic to follow suit if possible
                cardToPlay = hand.stream()
                        .filter(card -> card.getSuite() == suite)
                        .min(Comparator.comparingInt(a -> a.getValue().ordinal()))
                        .orElse(hand.stream()
                                .min(Comparator.comparingInt(a -> a.getValue().ordinal()))
                                .orElse(null));
                hand.remove(cardToPlay);
            }
        } else {
            // Human player logic to play a card
            StringBuilder cardIndexOut = new StringBuilder("Please select the index of card to play: ");
            List<Integer> validIndices = new ArrayList<>();
            for (int i = 0; i < hand.size(); i++) {
                if (suite == null || hand.get(i).getSuite() == suite) {
                    validIndices.add(i);
                }
                cardToPlay = hand.get(i);
                cardIndexOut.append(i).append(": [")
                        .append(cardToPlay.getValue().getStringValue())
                        .append(cardToPlay.getSuite().getUnicodeValue()).append("], ");
            }
            cardIndexOut.delete(cardIndexOut.length() - 2, cardIndexOut.length() - 1); // Remove the last comma and space
            while (true) {
                System.out.println(cardIndexOut);
                Scanner scanner = new Scanner(System.in);
                int index;
                try {
                    index = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                } catch (Exception e) {
                    System.out.println("Please enter a valid integer index.");
                    scanner.nextLine(); // Clear invalid input
                    continue;
                }

                if (index < 0 || index >= hand.size()) {
                    System.out.println("Invalid index. Please try again.");
                    continue;
                }

                if (!validIndices.contains(index) && !validIndices.isEmpty()) {
                    System.out.println("You must follow the suit " + suite + ". Please choose a valid card. Valid indices: ");
                    System.out.println(validIndices);
                } else {
                    cardToPlay = hand.get(index);
                    hand.remove(cardToPlay);
                    break;
                }
            }
        }
        System.out.printf("Player %s plays: %s%s%n", name,
                cardToPlay.getValue().getStringValue(), cardToPlay.getSuite().getUnicodeValue());
        return cardToPlay;
    }
}
