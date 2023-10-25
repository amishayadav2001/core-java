package com.aurionpro.test;

public class UncheckedExceptionTest {
	public static void main(String[] args) {
		System.out.println("Main start");
		function1();
		System.out.println("Main end");

	}

	private static void function1() {
		System.out.println("function1 start");
		try {
			function2();

		} catch (Exception e) {
			System.out.println("Handled in fuction1 ");
		}
		System.out.println("function1 end");
	}

	private static void function2() {
		System.out.println("function2 start");
		function3();
		System.out.println("function2 end");
	}

	private static void function3() {
		System.out.println("function3 start");
		function4();
		System.out.println("function3 end");
	}

	private static void function4() {
		System.out.println("function4 start");
		throw new RuntimeException();
	}

}
