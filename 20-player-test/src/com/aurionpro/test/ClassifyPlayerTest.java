package com.aurionpro.test;

import com.aurionpro.model.ClassifyPlayers;
import com.aurionpro.model.Player;

public class ClassifyPlayerTest {

	public static void main(String[] args) {

		Player[] players = { 
				new Player(1, "Amisha", 200, 4000, 85), 
				new Player(2, "Akash", 70, 7000, 160),
				new Player(3, "Suraj", 40, 3500, 170), 
				new Player(4, "Nikhil", 150, 4000, 140),
				new Player(5, "Niraj", 180, 6000, 155), 
				new Player(6, "Dhiraj", 80, 1000, 96),
				new Player(7, "Aniket", 90, 6670, 112), 
				new Player(8, "Nilesh", 40, 4196, 89),
				new Player(9, "Shubham", 150, 7000, 140), 
				new Player(10, "Krishna", 87, 3186, 91) };

		ClassifyPlayers classify = new ClassifyPlayers();

		Player[] alister = classify.getAListers(players);
		Player[] blister = classify.getBListers(players);
		Player[] clister = classify.getCListers(players);

		System.out.println("AListers are :");
		for (int i = 0; i < alister.length; i++) {
			System.out.println(alister[i].toString());
		}

		System.out.println("-------------------------------------------------------------");

		System.out.println("BListers are :");
		for (int i = 0; i < blister.length; i++) {
			System.out.println(blister[i].toString());

		}
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("CListers are :");
		for (int i = 0; i < clister.length; i++) {
			System.out.println(clister[i].toString());

		}
		
	}

}
