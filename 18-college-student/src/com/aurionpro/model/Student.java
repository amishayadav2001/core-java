package com.aurionpro.model;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person {
	public Student(int id, String address, LocalDate localDate, String branch) {
		super(id, address, localDate);
	}

	private String branch;

}
