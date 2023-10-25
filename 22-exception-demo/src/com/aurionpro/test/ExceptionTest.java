package com.aurionpro.test;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int firstNumber = Integer.parseInt(args[0]);
			System.out.println("statement 1");
			int secondNumber = Integer.parseInt(args[1]);
			System.out.println("statement 2");
			int div = firstNumber/secondNumber;
			System.out.println("Division =" +div);
		}
		catch(ArithmeticException e) {
			System.out.println("Number can not be divided by zero");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Access to invalid index position");
		}
		
		catch(RuntimeException e) {
			System.out.println("Invalid conversion to type Integer");
		}
		catch(Exception e) {
			System.out.println("Invalid conversion to type Integer");
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("Outside try catch , End of code!");
		
	}

}
