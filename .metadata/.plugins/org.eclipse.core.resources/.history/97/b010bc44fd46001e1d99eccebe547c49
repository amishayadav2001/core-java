package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomLinkedList<T> {
	private List<T> list;

	public CustomLinkedList() {
		list = new ArrayList<>();
	}

	public void add(T value) {
		list.add(value);
	}

	public void remove(T value) {
		 list.remove(value);
	}

	public void display() {
		for (T value : list) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public void iterate() {
		Iterator<T> iterator = list.iterator();
		while (iterator.hasNext()) {
			T value = iterator.next();
			System.out.println(value);
		}
	}

}
