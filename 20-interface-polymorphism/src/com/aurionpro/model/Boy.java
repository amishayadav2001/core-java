package com.aurionpro.model;

public class Boy implements IMannerable, IEmotinable {

	@Override
	public void laugh() {
		System.out.println("Boy laughs");
		
	}

	@Override
	public void cry() {
		System.out.println("Boy cries");
	}

	@Override
	public void wish() {
		System.out.println("Boy says Hi!");
		
	}

	@Override
	public void depart() {
		System.out.println("Boy says ByeBye!");
		
	}

}
