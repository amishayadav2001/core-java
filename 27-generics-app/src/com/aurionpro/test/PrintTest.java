package com.aurionpro.test;

import java.util.List;
import java.util.Arrays;

import com.aurionpro.model.PrintValue;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;

public class PrintTest {

	public static void main(String[] args) {
		// PrintValue<Integer> printObj = new PrintValue<Integer>(11);
		// printObj.print();
		//
		// PrintValue<Double> printObj2 = new PrintValue<Double>(11.9);
		// printObj2.print();
		//
		// PrintValue<String> printObj3 = new PrintValue<String>("Amisha");
		// printObj3.print();

		PrintValue<Rectangle> printObj4 = new PrintValue<Rectangle>(new Rectangle(11.0, 44.0));
		printObj4.print();

		printValues(11, "Amisha");
		printValues(11.9, "Amisha");
		printValues(11, 11.9);

		List<Integer> intList = Arrays.asList(11, 33, 44, 55, 66, 99);
		printList(intList);

		List<Double> doubleList = Arrays.asList(11.9, 33.9, 44.9, 55.9, 66.9, 99.9);
		printList(doubleList);

	}
	
	private static void printList(List<?> list) {
		for (Object x : list) {
			System.out.println(x);
		}
	}

//	private static <T> void printList(List<T> list) {
//		for (T x : list) {
//			System.out.println(x);
//		}
//	}

//	private static <T> void printList(List<T> list) {
//		System.out.println(list);
//	}

	private static <T, S> void printValues(T value1, S value2) {
		System.out.println(value1);
		System.out.println(value2);

	}

}
