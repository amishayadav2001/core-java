package com.aurionpro.model;

public class Parent {
	private int value;

	public Parent() {
		System.out.println("Inside Parent Constructor");
		this.value = 0;

	}

	public Parent(int value) {
		System.out.println("Inside Parent Constructor");
		this.value = value;
	}

}
