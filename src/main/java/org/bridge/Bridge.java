package org.bridge;

import org.bridge.enums.PlayerType;
import java.util.ArrayList;
import java.util.List;

public class Bridge{
    public static void main(String[] args) {
        Player south = new Player("South", PlayerType.HUMAN, "Team A");
        Player west = new Player("West", PlayerType.AI, "Team B");
        Player north = new Player("North", PlayerType.AI, "Team A");
        Player east = new Player("East", PlayerType.AI, "Team B");

        Floor floor = new Floor(new ArrayList<>(List.of(south, west, north, east)));
        floor.playGame();
    }
}
