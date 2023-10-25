package com.aurionpro.model;

public class StringBuffer {
    public static void main(String[] args) {
        java.lang.StringBuffer strBuffer = new java.lang.StringBuffer("Hello, ");
        strBuffer.append("World!"); 
        java.lang.String result = strBuffer.toString(); 
        System.out.println(result);
    }
}
