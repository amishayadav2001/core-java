package com.aurionpro.test;

import java.util.Scanner;

public class WordGuesserGame {
	public static void main(String[] args) {
		String[] words = { "apple", "banana", "orange", "grape", "lemon" }; 
		String wordToGuess = getRandomWord(words);
		char[] guessedWord = new char[wordToGuess.length()];
		int lives = 5;
		boolean gameOver = false;

		for (int i = 0; i < guessedWord.length; i++) {
			guessedWord[i] = '_';
		}

		Scanner sc = new Scanner(System.in);

		while (!gameOver) {
			System.out.println("Guess the word: " + String.valueOf(guessedWord));
			System.out.println("Lives remaining: " + lives);
			System.out.print("Guess a letter: ");

			char guess = sc.next().charAt(0);

			if (wordToGuess.indexOf(guess) != -1) {
				for (int i = 0; i < wordToGuess.length(); i++) {
					if (wordToGuess.charAt(i) == guess) {
						guessedWord[i] = guess;
					}
				}

				if (String.valueOf(guessedWord).equals(wordToGuess)) {
					System.out.println("Congratulations! You guessed the word: " + wordToGuess);
					gameOver = true;
				}
			} else {
				lives--;
				if (lives <= 0) {
					System.out.println("Game over! You have run out of lives.");
					gameOver = true;
				}
			}
		}

	}

	private static String getRandomWord(String[] words) {
		int index = (int) (Math.random() * words.length);
		return words[index];
	}
}
