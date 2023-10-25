package com.aurionpro.test;

import java.util.Arrays;

public class NamesTest {
    public static void main(String[] args) {
        String[] names = {"Amisha", "Suraj", "Akash", "Nikhil", "Vikram"};

        // Using names.stream().forEach
        
        Arrays.stream(names).forEach(name -> System.out.println(name));

        System.out.println("----------------------------------------------");

        // Using Arrays.asList(names).forEach
        Arrays.asList(names).forEach(name -> System.out.println(name));

        System.out.println("----------------------------------------------");

        // Using static reference method
        Arrays.asList(names).forEach(NamesTest::printName);
    }

    // Static reference method
    public static void printName(String name) {
        System.out.println(name);
    }
}

