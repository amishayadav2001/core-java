package com.aurionpro.model;

public class Distance {
	private int feet;
	private int inch;
	private int distance;

	public Distance(int feet,int inch) {
		this.feet=feet;
		this.inch=inch;
	}

	public Distance() {
		this(0,0);
		
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Distance addDistance(Distance d) {
		Distance temp = new Distance();
		temp.setInch(this.getInch() + d.getInch());
		return temp;

	}

}
