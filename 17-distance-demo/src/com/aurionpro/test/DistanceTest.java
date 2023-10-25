package com.aurionpro.test;

import com.aurionpro.model.Distance;

public class DistanceTest {

	public static void main(String[] args) {
		Distance distance1 = new Distance(3, 10);
		Distance distance2 = new Distance(7, 8);
		Distance caldistance = addDistance(distance1, distance2);
		System.out.println(caldistance);
	}

	public static Distance addDistance(Distance distance1, Distance distance2) {
		Distance tempDistance = new Distance();
		tempDistance.setInch(distance1.getInch() + distance2.getInch());
		tempDistance.setFeet(distance1.getFeet() + distance2.getFeet());
		correctDistance(tempDistance);
		return tempDistance;
	}

	public static void correctDistance(Distance tempDistance) {
		correctInch(tempDistance);
		correctFeet(tempDistance);

	}

	public static void correctFeet(Distance tempDistance) {
		if (tempDistance.getFeet() > 12) {
			tempDistance.setFeet(tempDistance.getFeet() % 12);

		}
	}

	public static void correctInch(Distance tempDistance) {
		while (tempDistance.getInch() > 12) {
			tempDistance.setInch(tempDistance.getInch() - 12);
			tempDistance.setFeet(tempDistance.getFeet() + 1);
		}

	}

}
