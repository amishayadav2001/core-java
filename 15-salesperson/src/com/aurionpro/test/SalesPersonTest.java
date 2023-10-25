package com.aurionpro.test;

import com.aurionpro.model.CityType;
import com.aurionpro.model.SalesPerson;

public class SalesPersonTest {

	public static void main(String[] args) {
		SalesPerson[] persons = { new SalesPerson(1, "Dhruv", CityType.BANGALORE, 20, 200000),
				new SalesPerson(2, "Yash", CityType.MUMBAI, 10, 290000),
				new SalesPerson(3, "Jay", CityType.PUNE, 5, 100000),
				new SalesPerson(4, "Ram", CityType.BANGALORE, 15, 650000),
				new SalesPerson(5, "Sham", CityType.PUNE, 13, 340000),
				new SalesPerson(6, "Sita", CityType.PUNE, 8, 700000),
				new SalesPerson(7, "Nita", CityType.MUMBAI, 11, 300000),
				new SalesPerson(8, "Gita", CityType.BANGALORE, 12, 800000),
				new SalesPerson(9, "Jinesh", CityType.MUMBAI, 6, 400000)

		};

		SalesPerson person = findSalesPersonWithHighestSales(persons);
		System.out.println(person);

		double totalSales = findSalesAmountOfAll(persons);
		System.out.println("Total sales of all sales person " + totalSales);

		System.out.println("+++++++++++++++++++++++++++++++++");
		CityType[] cities = CityType.class.getEnumConstants();

		for (CityType c : cities) {
			double cityTotalSales = findSalesByCity(c, persons);
			System.out.println("Total Sale in city " + c + " is " + cityTotalSales);
		}

		for (CityType c : cities) {
			SalesPerson salesperson = findSalesPersonWithHighestSalesByCity(c, persons);
			System.out.println("Peron with highest sale in city " + c + " is " + salesperson);
		}

	}

	private static SalesPerson findSalesPersonWithHighestSalesByCity(CityType c, SalesPerson[] persons) {
		SalesPerson maxSalesPerson = null;

		for (int i = 0; i < persons.length; i++) {
			if (maxSalesPerson == null && persons[i].getCity().equals(c)) {
				maxSalesPerson = persons[i];
			}

			if (maxSalesPerson != null && persons[i].getCity().equals(c)) {
				if (maxSalesPerson.getsalesAmount() < persons[i].getsalesAmount()) {
					maxSalesPerson = persons[i];
				}
			}
		}
		return maxSalesPerson;
	}

	private static double findSalesByCity(CityType c, SalesPerson[] persons) {
		double salesSum = 0;

		for (SalesPerson s : persons) {
			if (s.getCity().equals(c)) {
				salesSum += s.getsalesAmount();
			}
		}

		return salesSum;
	}

	private static double findSalesAmountOfAll(SalesPerson[] persons) {
		double salesSum = 0;

		for (SalesPerson s : persons) {
			salesSum += s.getsalesAmount();
		}

		return salesSum;
	}

	private static SalesPerson findSalesPersonWithHighestSales(SalesPerson[] persons) {
		SalesPerson maxSalesPerson = persons[0];

		for (SalesPerson p : persons) {
			if (maxSalesPerson.getsalesAmount() < p.getsalesAmount()) {
				maxSalesPerson = p;
			}
		}
		return maxSalesPerson;
	}

}
