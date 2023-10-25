package com.aurionpro.test;

import java.util.Scanner;

public class WaterBillApplication {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        
	        System.out.println("Enter total consumption in units: ");
	        int unitsConsumed = sc.nextInt();
	        
	        int bill;
	        
	        if (unitsConsumed <=100) {
	            bill = unitsConsumed * 5;
	        } else if (unitsConsumed <= 250) {
	            bill = unitsConsumed * 10;
	        } else {
	            bill = unitsConsumed * 20;
	        }
	        
	        int meter_Charge = 75;
	        int Charge = bill;
	        int total_water_Bill = Charge + meter_Charge;
	        
	        System.out.println("Total Water Bill is: " +total_water_Bill);
	        

	}

}
