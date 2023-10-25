package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;
import com.aurionpro.model.Vehicle;

public class PolymorphismTest {
	public static void main(String[] args) {
		IMovable[] movables = { 
				new Car("Thar", LocalDate.of(2023, 3, 4)),
				new Bike("Bullet", LocalDate.of(2023, 3, 4)),
				new Bus("Krishna", LocalDate.of(2023, 3, 4)),

		};

		System.out.println(movables);

		for (IMovable x : movables) {
			startMoving(x);
		}
	}

	private static void startMoving(IMovable x) {
		System.out.println(x);
		Vehicle obj = (Vehicle) x;
		obj.showTopSpeed();

	}

}
