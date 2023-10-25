package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		ArrayList<LineItem> itemList = new ArrayList<LineItem>();
		itemList.add(new LineItem(11, "CNC", 150, 200));
		itemList.add(new LineItem(13, "Snacks", 160, 300));
		itemList.add(new LineItem(14, "Gooday", 170, 400));
		itemList.add(new LineItem(15, "Tiger", 180, 500));

		double sum = 0;
		for (LineItem x : itemList) {
			sum += x.getTotalCost();
			System.out.println(x);
		}

		System.out.println(" Total cost of itemList is " + sum);

	}

}
