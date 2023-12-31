package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.aurionpro.model.SavingAccount;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
		if (args.length == 0) {
			System.out.println("class name");
			return;
		}

		String className = args[0];
		System.out.println("Entered class name: " + className);

		Class<?> tempClass = Class.forName(className);
		System.out.println("******************************Fields********************");

		Field[] declaredFields = tempClass.getDeclaredFields();

		for (Field f : declaredFields) {
			System.out.println(f);
		}
		System.out.println("*******************constructors**************************");

		Constructor<?>[] declaredConstructor = tempClass.getConstructors();

		for (Constructor<?> c : declaredConstructor) {
			System.out.println(c);

		}

		System.out.println("*********************Methods****************************");
		Method[] methods = tempClass.getMethods();

		for (Method m : methods) {
			System.out.println(m);
		}

		Class<? super SavingAccount> superclass = SavingAccount.class.getSuperclass();

		System.out.println(superclass.getSimpleName());

	}

}





//package com.aurionpro.test;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.util.Scanner;
//
//import com.aurionpro.model.SavingAccount;
//
//public class ReflectionTest {
//	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter class name");
//		String className = sc.nextLine();
//		System.out.println(className);
//
//		Class<?> tempClass = Class.forName(className);
//		System.out.println("******************************Fields********************");
//
//		Field[] declaredFields = tempClass.getDeclaredFields();
//
//		for (Field f : declaredFields) {
//			System.out.println(f);
//		}
//		System.out.println("*******************constructors**************************");
//
//		Constructor<?>[] declaredConstructor = tempClass.getConstructors();
//
//		for (Constructor c : declaredConstructor) {
//			System.out.println(c);
//
//		}
//
//		System.out.println("*********************Methods****************************");
//		Method[] methods = tempClass.getMethods();
//
//		for (Method m : methods) {
//			System.out.println(m);
//		}
//
//		Class<? super SavingAccount> superclass = SavingAccount.class.getSuperclass();
//
//		System.out.println(superclass.getSimpleName());
//
//	}
//}
//
//
//
