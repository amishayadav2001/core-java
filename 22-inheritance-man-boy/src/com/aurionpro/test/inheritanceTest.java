package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class inheritanceTest {

	public static void main(String[] args) {
		case1();
		System.out.println("--------------------");
		case2();
		System.out.println("--------------------");
		case3();
		System.out.println("--------------------");
		case4();
		System.out.println("--------------------");
		case5();
		System.out.println("--------------------");
		case6();

	}

	private static void case1() {
		Man man = new Man();
		//man = new Man();
		man.read();
		man.play();

	}

	private static void case2() {
		Boy boy;
		boy = new Boy();
		boy.eat();
		boy.read();
		boy.play();
	}

	private static void case3() {
		Man man;
		man = new Infant();
		man.read();
		man.play();
	}

	private static void case4() {
		playAtPark(new Man());
		playAtPark(new Boy());
		playAtPark(new Kid());
		playAtPark(new Infant());

	}

	private static void playAtPark(Man man) {
		System.out.println("At the park: ");
		man.play();
	}

	private static void case5() {
		Object obj;

		obj = 10;
		System.out.println(obj.getClass().getSimpleName());

		obj = "My name is Amisha";
		System.out.println(obj.getClass().getSimpleName());

		obj = 11 > 3;
		System.out.println(obj.getClass().getSimpleName());

	}

	public static void case6() {
		typeCasteObject(new Infant());
	}

	private static void typeCasteObject(Man man) {
		if (man instanceof Infant) {
			Infant infant = (Infant) man;
			infant.sleep();
		}

	}

}
