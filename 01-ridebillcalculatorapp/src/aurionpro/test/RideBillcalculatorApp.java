package aurionpro.test;

import java.util.Scanner;

public class RideBillcalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the height (in cm): ");
		int height = sc.nextInt();

		if (height > 120) {
			System.out.print("Can the person ride (yes/no)? ");
			String canRide = sc.next();

			if (canRide.equalsIgnoreCase("yes")) {
				System.out.println("Enter the age: ");
				int age = sc.nextInt();
				double totalBill = calculateRideBill(age);
				System.out.println("Total Bill: $" + totalBill);
			} else {
				System.out.println("Sorry, the person cannot ride.");
			}
		} else {
			System.out.println("Sorry, the person cannot ride.");
		}
	}

	public static double calculateRideBill(int age) {
		double rideFare;
		if (age < 12) {
			rideFare = 5.0;
		} else if (age >= 12 && age <= 18) {
			rideFare = 7.0;
		} else if (age >= 45 && age <= 55) {
			rideFare = 0.0;
		} else {
			rideFare = 12.0;
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("Want photos (yes/no)? ");
		String wantPhotos = sc.next();

		if (wantPhotos.equalsIgnoreCase("yes")) {
			return rideFare + 6.0;
		} else {
			return rideFare;
		}
	}

}
