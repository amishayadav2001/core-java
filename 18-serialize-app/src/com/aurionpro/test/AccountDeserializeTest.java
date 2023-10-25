package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.aurionpro.model.Account;

public class AccountDeserializeTest {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\amisha.yadav\\Desktop\\FileHandling.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            Account obj = (Account) in.readObject();
            in.close();
            file.close();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
