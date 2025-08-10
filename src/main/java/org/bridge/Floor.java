package org.bridge;

import org.bridge.enums.PlayerType;
import org.bridge.enums.Suite;
import org.bridge.enums.Value;

import java.util.Collections;
import java.util.List;

public final class Floor {
    private List<Player> players;

    public Floor(List<Player> players) {
        this.players = players;
        initializeFloor();
    }


    private void initializeFloor() {
        Deck.PutCardsInDeck();
        Deck.Shuffle();

        System.out.println("Game initialized with players:");
        for (Player player : players) {
            System.out.println(player.getName() + " (" + player.getPlayerType() + ")");
        }

        dealCards();

        System.out.println("Cards have been dealt to each player.");
    }

    public void playGame() {
        // Game logic to play the game
        System.out.println("Game started!");
        // Implement game logic here
        // For example, players take turns playing cards, scoring, etc.
        int rotate = 0;
        int team1Score = 0;
        int team2Score = 0;
        int roundCount = 0;
        int maxRounds = 13; // Each player plays 13 cards in a standard game
        while(roundCount < maxRounds) {
            printPlayerHands();
            Collections.rotate(players, (rotate * -1));
            Suite currentSuite = null;
            Value maxValue = null;
            Player roundWinner = null;
            for (Player player : players) {
                Cards card = player.playCard(currentSuite);

                if (currentSuite == null) {
                    currentSuite = card.getSuite();
                }

                if (card.getSuite().equals(currentSuite)) {
                    if (maxValue == null || card.getValue().ordinal() > maxValue.ordinal()) {
                        maxValue = card.getValue();
                        roundWinner = player;
                        rotate = players.indexOf(player);
                    }
                }
            }

            if (roundWinner.getTeam().equals("Team A")) {
                team1Score++;
            } else {
                team2Score++;
            }
            System.out.println("Round winner: " + roundWinner.getName() + " from " + roundWinner.getTeam());
            System.out.println("Team A Score: " + team1Score + ", Team B Score: " + team2Score);
            roundCount++;
        }
        // End of game logic
        System.out.println("Game ended!");
        System.out.println("Final Scores:");
        System.out.println("Team A: " + team1Score);
        System.out.println("Team B: " + team2Score);
        if (team1Score > team2Score) {
            System.out.println("Team A wins!");
        } else if (team2Score > team1Score) {
            System.out.println("Team B wins!");
        } else {
            System.out.println("It's a tie!");
        }
        System.out.println("Thank you for playing!");
    }

    private void dealCards() {
        for (Player player : this.players) {
            for (int i = 0; i < 13; i++) {
                player.addCardToHand(Deck.getCard());
            }
        }
    }

    private void printPlayerHands() {
        for (Player player : players) {
            if (player.getPlayerType().equals(PlayerType.HUMAN)) {
                String hand = player.getHand().stream()
                        .map(card -> card.getValue().getStringValue() + card.getSuite().getUnicodeValue())
                        .reduce((card1, card2) -> card1 + ", " + card2)
                        .orElse("No cards in hand");
                System.out.println(player.getName() + "'s hand: " + hand);
            } else {
                System.out.println(player.getName() + "'s hand size: " + player.getHand().size());
            }
        }
    }
}
