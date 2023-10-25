package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Account;

public class AccountSerializeTest {
	public static void main(String[] args) {
		Account account = new Account(11, "Amisha", 20000);
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\amisha.yadav\\Desktop\\amisha\\java\\test.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(account);
			out.close();
			file.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
