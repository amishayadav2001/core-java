package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Account;

public class AccountDeserializeTest {
	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("C:\\Users\\amisha.yadav\\Desktop\\amisha\\java\\test.txt");
			ObjectInputStream in = new ObjectInputStream(file);

			Account[] account = (Account[]) in.readObject();
			in.close();
			file.close();
			
			for (int i=0; i<account.length; i++) {
				System.out.println(account[i].toString());
			}
//			System.out.println(account.toString());
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}


