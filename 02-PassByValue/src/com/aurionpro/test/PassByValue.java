package com.aurionpro.test;

public class PassByValue {

	public static void main(String[] args) {
		int number=1;
		System.out.println(number);
		incrementByten(number);
		System.out.println(number);

	}
	private static void incrementByten(int number) {
		number+=10;
		System.out.println(number);
	}
	

}
