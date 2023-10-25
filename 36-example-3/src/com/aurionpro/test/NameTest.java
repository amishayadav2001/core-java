package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;

public class NameTest {
    public static void main(String[] args) {
        String[] names = {"Jay", "Nimesh", "Mark", "Mahesh", "Ramesh"};

        System.out.println("Names of first 3 students sorted in ascending order:");
        Arrays.stream(names, 0, 3)
              .sorted()
              .forEach(System.out::println);

        System.out.println("\nNames of first 3 students sorted in ascending order if their names contain 'a':");
        Arrays.stream(names, 0, 3)
              .filter(name -> name.contains("a"))
              .sorted()
              .forEach(System.out::println);

        System.out.println("\nNames of students sorted in descending order:");
        Arrays.stream(names)
              .sorted(Comparator.reverseOrder())
              .forEach(System.out::println);

        System.out.println("\nFirst 3 characters of names of students:");
        Arrays.stream(names)
              .map(name -> name.length() >= 3 ? name.substring(0, 3) : name)
              .forEach(System.out::println);

        System.out.println("\nNames of students with less than or equal to 4 characters:");
        Arrays.stream(names)
              .filter(name -> name.length() <= 4)
              .forEach(System.out::println);
    }
}

