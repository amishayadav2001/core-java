package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers.size());
		System.out.println(numbers);
		
		System.out.println(numbers.contains(30));
		
		numbers.remove(new Integer(10));
		numbers.remove(1);
		System.out.println(numbers);
		
		//numbers.clear();
		//System.out.println(numbers);
		
		for (Integer number : numbers) {
		    System.out.println(number);
		}

	}

}


