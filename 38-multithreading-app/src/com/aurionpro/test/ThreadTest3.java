package com.aurionpro.test;

import com.aurionpro.model.PrintCharacter;

public class ThreadTest3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new InnerClass(), "static thread");
		t1.start();

		Runnable runObj = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "Annonymous class ");

			}
		};

		Thread t2 = new Thread(runObj, "annonymousThread");
		t2.start();

		Runnable runObj2 = () -> {
			System.out.println(Thread.currentThread().getName() + "lamda class ");

		};
		Thread t3 = new Thread(runObj2, "lamdaThread");
		t3.start();

	}

	private static class InnerClass implements Runnable {

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "static inner class ");

		}

	}

}
