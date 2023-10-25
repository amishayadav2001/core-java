package aurionpro.test;

import java.util.Scanner;

public class TreasureHuntApp {

	public static void main(String[] args) {
		System.out.println("Welcome to treasure Island. Your mission is to find the treasure");
		Scanner sc = new Scanner(System.in);
		System.out.println("left or right?");
		String leftright = sc.next();
		if (leftright.equalsIgnoreCase("left")) {
			System.out.println("swim or wait?");
			String swimwait = sc.next();
			if (swimwait.equalsIgnoreCase("wait")) {
				System.out.println("Which door?");
				String redbluegreen = sc.next();
				if (redbluegreen.equalsIgnoreCase("blue")) {
					System.out.println("Eaten by Beasts. Game Over.");
				} else if (redbluegreen.equalsIgnoreCase("yellow")) {
					System.out.println("You Win!");
				} else if (redbluegreen.equalsIgnoreCase("red")) {
					System.out.println("Burned by fire. Game Over.");
				} else {
					System.out.println("Game Over.");
				}
			} else {
				System.out.println("Attacked by trout. Game Over.");
			}
			
		} else {
			System.out.println("Fall into a hole. Game Over.");
		}

	}

}
