package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotinable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class PolymorphismTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();

		atTheParty(man);
		atTheParty(boy);

		//atTheMovies(man);  can not pass man Object to IMannerable
		atTheMovies(boy);

	}

	private static void atTheMovies(IEmotinable obj) {
		System.out.println("At the movie hall");
		obj.cry();
		obj.laugh();

	}

	private static void atTheParty(IMannerable obj) {
		System.out.println("At the party hall");
		obj.wish();
		obj.depart();

	}

}
