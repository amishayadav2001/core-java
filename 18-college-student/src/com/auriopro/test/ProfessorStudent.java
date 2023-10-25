package com.auriopro.test;

import java.time.LocalDate;

import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;

public class ProfessorStudent {
	public static void main(String[] args) {
		Student student = new Student(11, "Amisha", LocalDate.of(2023, 2, 4), "EXTC");
		System.out.println(student);
		
		Professor professor = new Professor(33, "Akash", LocalDate.of(2023, 4, 23),"CIVIL");
		System.out.println(professor);
		
	}

}
