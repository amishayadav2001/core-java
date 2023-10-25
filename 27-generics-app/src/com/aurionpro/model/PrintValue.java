package com.aurionpro.model;

public class PrintValue<T extends Shape> {
	
	private T value;

	public PrintValue(T value) {
		super();
		this.value = value;
	}
	
	public void print() {
		System.out.println(value);
	}
	

}
