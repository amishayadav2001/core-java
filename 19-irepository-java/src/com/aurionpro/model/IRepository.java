package com.aurionpro.model;

public interface IRepository {

	int categories = 10;

	void create();

	public abstract void read();

	void update();

	void delete();

	public default void showGreetings() {
		System.out.println("Hello from product interface");
	}

	public static void printWelcomeMessage() {
		System.out.println("Hello welcome to Aurionpro");
	}

}
