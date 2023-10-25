package com.aurionpro.test;

import java.util.Arrays;
import java.util.HashMap;

public class StatisticsCalculator {
	public static void main(String[] args) {
		int[] numbers = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}

		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}

		double average = (double) sum / numbers.length;

		int min = Arrays.stream(numbers).min().getAsInt();
		int max = Arrays.stream(numbers).max().getAsInt();

		Arrays.sort(numbers);
		double median;
		if (numbers.length % 2 == 0) {
			int middleIndex = numbers.length / 2;
			median = (numbers[middleIndex - 1] + numbers[middleIndex]) / 2.0;
		} else {
			median = numbers[numbers.length / 2];
		}

		int[] frequency = new int[max - min + 1];
		for (int number : numbers) {
			frequency[number - min]++;
		}

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Median: " + median);
		System.out.println("Frequency:");
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println((i + min) + ": " + frequency[i]);
			}
		}
	}
}
