package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerArrayList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 25, 35, 45);

		int min = numbers.stream()
				.min(Integer::compareTo)
				.orElse(Integer.MAX_VALUE);
		System.out.println("Minimum value: " + min);

		int max = numbers.stream()
				.max(Integer::compareTo)
				.orElse(Integer.MIN_VALUE);
		System.out.println("Maximum value: " + max);
	}
}
