package com.aurionpro.test;

import java.io.*;
import java.util.stream.Stream;

public class FileTest {
        
    public static void readUsingFileReader() {
        try {
            FileReader reader = new FileReader("C:\\Users\\amisha.yadav\\Desktop\\Test.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            //reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nFile reading using FileReader complete.");
    }

    public static void readUsingStream() {
        try {
            Stream<String> lines = new BufferedReader(new FileReader("C:\\Users\\amisha.yadav\\Desktop\\Test.txt")).lines();
            lines.forEach(System.out::println);
            //lines.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File reading using Stream complete.");
    }
}

