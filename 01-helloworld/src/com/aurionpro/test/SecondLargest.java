package com.aurionpro.test;

public class SecondLargest {

	public static void main(String[] args) {
		int largest = 0;
		int secondlargest = Integer.MIN_VALUE;
		for (int i = 0; i < args.length; i++) {
			if (largest < Integer.parseInt(args[i])) {
				secondlargest = largest;
				largest = Integer.parseInt(args[i]);
			} else if (secondlargest < Integer.parseInt(args[i])) {
				secondlargest = Integer.parseInt(args[i]);
			}
		}
		System.out.println(secondlargest);

	}

}
