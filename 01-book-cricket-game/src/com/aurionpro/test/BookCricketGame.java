package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class BookCricketGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Welcome to Book Cricket Game!");
		System.out.println("Rules for the Game: ");
		System.out.println("** Assume a book of 300 pages");
		System.out.println("1.Player 1 opens the book to read a page number (Randomly generated)");
		System.out.println("2.Total score of a player = page number % 7 (number % 7 will always be between 0-6)");
		System.out.println("3.Player 1 continues and keeps adding to the score until page number results in a 0 score ");
		System.out.println("4.player 2 starts the game and tries to beat the score of player 1");
		System.out.println("5.In case of a tie,check the number of turns (player with lesser turns is winner");
		System.out.println("6.Show the winner of the game.");
		

        System.out.print("Enter 1 to start the game or 0 to exit: ");
        int startGame = sc.nextInt();

		if (startGame == 0) {
			System.out.println("Exit");
			return;
		} else if (startGame == 1) {
			System.out.print("Enter Player 1 name: ");
			sc.nextLine(); 
			String player1 = sc.nextLine();
			System.out.print("Enter Player 2 name: ");
			String player2 = sc.nextLine();

			System.out.println("player: " + player1);
			System.out.println("Enter 1 to Open Book: ");
			int number=sc.nextInt();

			int player1Score = 0;
			int player2Score = 0;
			int player1Turns = 0;
			int player2Turns = 0;
			boolean player1Turn = true;
			boolean gameOver = false;

			while (!gameOver) {
				String currentPlayer = player1Turn ? player1 : player2;
				int page = random.nextInt(300) + 1;
				int point = page % 7;
				int score = page % 7;

				System.out.println( "Page Number " + page  + "      " +  "Point is: " + point +   "        "     + "Score is:" + score             );

				if (currentPlayer.equals(player1)) {
					if (score == 0) {
						System.out.println(player1 + " is out!");
						player1Turns++;
						player1Turn = false;
					} else {
						player1Score += score;
					}
				} else {
					if (score == 0) {
						System.out.println(player2 + " is out!");
						player2Turns++;
						player1Turn = true;
					} else {
						player2Score += score;
					}
				}

				System.out.println(player1 + " total score: " + player1Score);
				System.out.println(player2 + " total score: " + player2Score);

				if (player1Score >= 100 || player2Score >= 100) {
					gameOver = true;
				} else {
					System.out.print("Press Enter to continue to the next round...");
					sc.nextLine();
					if (currentPlayer.equals(player1)) {
						player1Turns++;
					} else {
						player2Turns++;
					}
					player1Turn = !player1Turn;
				}
			}

			System.out.println("Game Over!");
			System.out.println(player1 + " total score: " + player1Score + " in " + player1Turns + " rounds");
			System.out.println(player2 + " total score: " + player2Score + " in " + player2Turns + " rounds");

			if (player1Score > player2Score) {
				System.out.println(player1 + " wins!");
			} else if (player2Score > player1Score) {
				System.out.println(player2 + " wins!");
			} else {
				if (player1Turns < player2Turns) {
					System.out.println(player1 + " wins due to fewer rounds played.");
				} else if (player2Turns < player1Turns) {
					System.out.println(player2 + " wins due to fewer rounds played.");
				} else {
					System.out.println("It's a tie!");
				}
			}
		}
	}

}
