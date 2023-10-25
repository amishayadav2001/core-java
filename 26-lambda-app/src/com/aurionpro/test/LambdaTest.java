package com.aurionpro.test;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.aurionpro.model.IGreetable;
import com.aurionpro.model.WelcomeGreeting;

public class LambdaTest {

	public static void main(String[] args) {
		IGreetable obj = new WelcomeGreeting();
		obj.printGreetings();

		IGreetable byeObj = new IGreetable() {

			@Override
			public void printGreetings() {
				System.out.println("Thanks for coming, goodbye!");
			}

		};

		byeObj.printGreetings();

		IGreetable goodDayObj = () -> System.out.println("Good Day!!"); // creating lambda function

		goodDayObj.printGreetings();

		IGreetable greetObj = LambdaTest::helloStudents; // direct create method using this lambda statement

		greetObj.printGreetings();

		// functional interfaces
		// consumer

		Consumer<String> consumer = (name) -> {
			System.out.println(name);

		};

		consumer.accept("Amisha");

		Consumer<Integer> intObj = (x) -> {
			System.out.println(x * x);

		};

		intObj.accept(11);

		// Function

		Function<String, Integer> funcObj = (name) -> {
			return name.length();
		};

		System.out.println(funcObj.apply("Amisha"));

		Function<String, String> funcObj2 = (name) -> {
			return name.toLowerCase();
		};

		System.out.println(funcObj2.apply("Amisha"));

		// Predicate

		Predicate<String> predicateObj = (String) -> {
			return String.length() <= 5;
		};

		System.out.println(predicateObj.test("Amisha"));

		Predicate<Integer> predicateObj2 = (num) -> {
			return num % 2 == 0;
		};

		System.out.println(predicateObj2.test(11));

		// Bifunctions
		// function

		BiFunction<Integer, Integer, Integer> biFunc = (num1, num2) -> {
			return num1 + num2;
		};

		System.out.println(biFunc.apply(11, 99));

		// consumer

		BiConsumer<String, String> conObj = (name, name1) -> {
			System.out.println(name);

		};

		conObj.accept("Amisha", "Yadav");

		// predicate

		BiPredicate<String, String> predicateObj3 = (String, String2) -> {
			return String.length() <= 5;
		};

		System.out.println(predicateObj3.test("Amisha", "Suraj"));

	}

	public static void helloStudents() {
		System.out.println("Hello Students");
	}

}
