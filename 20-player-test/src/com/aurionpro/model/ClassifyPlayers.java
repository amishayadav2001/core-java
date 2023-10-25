package com.aurionpro.model;

public class ClassifyPlayers{
	
	public Player[] getAListers(Player[] players) {
		
		int count = 0;
		for (int i=0; i<players.length; i++) {
			if (players[i].getMatches()>100 && (players[i].getRuns() > 5000 || players[i].getWickets()>150)) {
				count ++;
			}
		}
		
    	Player[] alisters = new Player[count]; 
		for (int i=0, j=0; i<players.length; i++) {
			if (players[i].getMatches()>100 && (players[i].getRuns() > 5000 || players[i].getWickets()>150)) {
				alisters[j] = players[i];
				j++;
			}
		}
		
		return alisters;
	}
	
	public Player[] getBListers(Player[] players) {
		int count = 0;
		for (int i=0; i<players.length; i++) {
			if ((players[i].getMatches()>50 && players[i].getMatches()<=100) && ((players[i].getRuns() > 3000 && players[i].getRuns() <= 5000) || (players[i].getWickets()>75 && players[i].getWickets()<=150))) {
				count ++;
			}
		}
		
		Player[] blisters = new Player[count]; 
		for (int i=0, j=0; i<players.length; i++) {
			if ((players[i].getMatches()>50 && players[i].getMatches()<=100) && ((players[i].getRuns() > 3000 && players[i].getRuns() <= 5000) || (players[i].getWickets()>75 && players[i].getWickets()<=150))) {
				blisters[j] = players[i];
				j++;
			}
		}
		
		return blisters;
	}
	
	public Player[] getCListers(Player[] players) {
		int count = 0;
		for (int i=0; i<players.length; i++) {
			if (players[i].getMatches()>50 && players[i].getRuns() > 3000 || players[i].getWickets()>150) {
				count ++;
			}
		}
		
		Player[] clisters = new Player[count]; ; 
		for (int i=0, j=0; i<players.length; i++) {
			if (players[i].getMatches()>50 && players[i].getRuns() > 3000 || players[i].getWickets()>150) {
				clisters[j] = players[i];
				j++;
			}
		}
		
		return clisters;
	}

	
}
