package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	public static void main(String[] args) {
		playNumberGuesser();
	}

	public static void playNumberGuesser() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int generatedNumber;
		int userGuess;
		int attempts = 0;
		boolean playAgain = true;

		System.out.println("Welcome to the Number Guesser game!");

		while (playAgain) {
			generatedNumber = random.nextInt(100) + 1;
			attempts = 0;

			System.out.println("Random number is generated between 1 and 100.");
			System.out.println("Try to guess the number!");

			while (true) {
				System.out.print("Enter your guess: ");
				userGuess = sc.nextInt();
				attempts++;

				if (userGuess == generatedNumber) {
					System.out.println("Congratulations! You guessed the correct number " + generatedNumber + " in "
							+ attempts + " attempts.");
					break;
				} else if (userGuess < generatedNumber) {
					System.out.println("Sorry, Too Low.");
				} else {
					System.out.println("Sorry, Too High.");
				}
			}

			System.out.print("Do you want to play again? (yes/no): ");
			String playAgainChoice = sc.next();

			if (!playAgainChoice.equalsIgnoreCase("yes")) {
				playAgain = false;
			}
		}

		System.out.println("Thank you for playing the Number Guesser game. Goodbye!");

	}
}
