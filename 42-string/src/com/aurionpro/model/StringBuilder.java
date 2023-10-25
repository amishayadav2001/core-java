package com.aurionpro.model;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder strBuilder = new java.lang.StringBuilder("Hello, ");
        strBuilder.append("World!"); 
        java.lang.String result = strBuilder.toString(); 
        System.out.println(result);
    }
}
