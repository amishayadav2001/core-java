package com.aurionpro.test;

import com.aurionpro.model.Distance;

public class DistanceTest {

	public static void main(String[] args) {
		Distance d1 = new Distance(10,6);
		Distance d2 = new Distance(6,7);
		Distance d3 = d1.addDistance(d2);

	}

}
