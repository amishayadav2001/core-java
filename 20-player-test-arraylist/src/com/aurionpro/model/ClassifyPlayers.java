package com.aurionpro.model;

import java.util.ArrayList;

public class ClassifyPlayers {

    public ArrayList<Player> getAListers(ArrayList<Player> players) {
        ArrayList<Player> alisters = new ArrayList<>();
        for (Player player : players) {
            if (player.getMatches() > 100 && (player.getRuns() > 5000 || player.getWickets() > 150)) {
                alisters.add(player);
            }
        }
        return alisters;
    }

    public ArrayList<Player> getBListers(ArrayList<Player> players) {
        ArrayList<Player> blisters = new ArrayList<>();
        for (Player player : players) {
            if ((player.getMatches() > 50 && player.getMatches() <= 100) &&
                    ((player.getRuns() > 3000 && player.getRuns() <= 5000) ||
                            (player.getWickets() > 75 && player.getWickets() <= 150))) {
                blisters.add(player);
            }
        }
        return blisters;
    }

    public ArrayList<Player> getCListers(ArrayList<Player> players) {
        ArrayList<Player> clisters = new ArrayList<>();
        for (Player player : players) {
            if (player.getMatches() > 50 && (player.getRuns() > 3000 || player.getWickets() > 150)) {
                clisters.add(player);
            }
        }
        return clisters;
    }

}
