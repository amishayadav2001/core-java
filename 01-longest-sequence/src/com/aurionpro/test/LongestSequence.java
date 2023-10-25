package com.aurionpro.test;

import java.util.Scanner;

public class LongestSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		char longestChar = findLongestSequence(input);
		System.out.println("The longest sequence of character '" + longestChar + "' is: "
				+ getLongestSequence(input, longestChar));
	}

	public static char findLongestSequence(String input) {
		char[] chars = input.toCharArray();
		int maxLength = 0;
		char longestChar = '\0';

		int currentLength = 1;
		char currentChar = chars[0];

		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == currentChar) {
				currentLength++;
			} else {
				if (currentLength > maxLength) {
					maxLength = currentLength;
					longestChar = currentChar;
				}
				currentChar = chars[i];
				currentLength = 1;
			}
		}

		if (currentLength > maxLength) {
			maxLength = currentLength;
			longestChar = currentChar;
		}

		return longestChar;
	}

	public static String getLongestSequence(String input, char longestChar) {
		StringBuilder sequence = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == longestChar) {
				sequence.append(longestChar);
			}
		}
		return sequence.toString();
	}
}
