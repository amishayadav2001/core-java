package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student =new Student();
		
		student.id=11;
		student.name="Amisha";
		student.email="amisha.gmail.com";
		student.percentage=90;
		
		System.out.println("Id=" + student.id + ",Name = " +student.name + ",email=" + student.email + ",percentage=" + student.percentage);
	}

}
