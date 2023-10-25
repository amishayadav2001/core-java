package com.aurionpro.test;

import com.aurionpro.model.PrintNumber;

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("Inside main");
		PrintNumber p1 = new PrintNumber();
		p1.start();
		p1.setName("printer 1");
		p1.getPriority();
		p1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(p1.getPriority());
		
		PrintNumber p2 = new PrintNumber();
		p2.start();
		p2.setName("printer 2");
		p2.getPriority();
		System.out.println("End of main");
		

	}

}
