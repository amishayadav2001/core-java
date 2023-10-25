package com.aurionpro.test;

import com.aurionpro.model.ClassifyPlayers;
import com.aurionpro.model.Player;

import java.util.ArrayList;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<>();

		players.add(new Player(1, "Amisha", 11, 4000, 99));
		players.add(new Player(2, "Akash", 33, 7000, 16));
		players.add(new Player(3, "Suraj", 44, 3500, 83));
		players.add(new Player(4, "Nikhil", 15, 4000, 14));
		players.add(new Player(5, "Niraj", 99, 6000, 15));
		players.add(new Player(6, "Dhiraj", 88, 1000, 96));
		players.add(new Player(7, "Aniket", 66, 6670, 111));
		players.add(new Player(8, "Nilesh", 111, 4196, 89));
		players.add(new Player(9, "Shubham", 160, 7000, 144));
		players.add(new Player(10, "Krishna", 199, 3186, 91));

		ClassifyPlayers classify = new ClassifyPlayers();

		ArrayList<Player> alister = classify.getAListers(players);
		ArrayList<Player> blister = classify.getBListers(players);
		ArrayList<Player> clister = classify.getCListers(players);

		System.out.println("AListers are:");
		for (Player player : alister) {
			System.out.println(player.toString());
		}

		System.out.println("-------------------------------------------------------------");

		System.out.println("BListers are:");
		for (Player player : blister) {
			System.out.println(player.toString());
		}

		System.out.println("-------------------------------------------------------------");

		System.out.println("CListers are:");
		for (Player player : clister) {
			System.out.println(player.toString());
		}
	}
}
