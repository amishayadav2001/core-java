package com.aurionpro.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceTest {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10, 20, 30, 40, 20, 30, 40, 10);

		Map<Integer, Integer> countMap = new HashMap<>();

		for (Integer x : numberList) {
			if (!countMap.containsKey(x)) {
				countMap.put(x, 1);
			} else {
				countMap.put(x, countMap.get(x) + 1);
			}
		}

		countMap.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}
}
