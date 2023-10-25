package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
	public static void main(String[] args) {
		playPig();
	}

	public static void playPig() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int turnScore = 0;
        int turnCount = 0;

        System.out.println("Let's Play Pig!");
        while (totalScore < 20) {
            turnCount++;
            System.out.println("-------------------------------------");
            System.out.println("TURN " + turnCount);

            boolean turnOver = false;
            while (!turnOver) {
                System.out.println("Roll or hold? (r/h): ");
                String input = sc.nextLine().trim().toLowerCase();

                if (input.equals("r")) {
                    int roll = random.nextInt(6) + 1;
                    System.out.println("Die: " + roll);

                    if (roll == 1) {
                        System.out.println("Turn over. No score.");
                        turnScore = 0;
                        turnOver = true;
                    } else {
                        turnScore += roll;
                    }
                } else if (input.equals("h")) {
                    totalScore += turnScore;
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + totalScore);
                    turnOver = true;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }

        System.out.println("\nYou finished in " + turnCount + " turns!");
        System.out.println("Game over!");

        
    }
}
