package com.aurionpro.test;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student(11, "Amisha", 85), 
				new Student(33, "Akash", 89),
				new Student(44, "Suraj", 99), 
				new Student(99, "Nikhil", 95), 
				new Student(88, "Nilesh", 96));

		Student maxStudent = studentList.get(0);
		for (Student x : studentList) {
			if (x.getPercentage() > maxStudent.getPercentage()) {
				maxStudent = x;
			}
		}
		System.out.println("student with max percentage: " + maxStudent);

		Student minStudent = studentList.get(0);
		for (Student x : studentList) {
			if (x.getPercentage() < minStudent.getPercentage()) {
				minStudent = x;
			}
		}
		System.out.println("Student with the least percentage: " + minStudent);
		
        System.out.println("Sorting by percentage: \n ");
        
		studentList.sort(Comparator.comparingDouble(Student::getPercentage).reversed());

		for (Student x : studentList) {
			System.out.println(x);
		}

		System.out.println("---------------------------------------------------------------");
		
        System.out.println("Sorting by name: \n");
        
		studentList.sort(Comparator.comparing(Student::getName));

		for (Student x : studentList) {
			System.out.println(x);
		}

	}
}

// System.out.println(students);
//
// Student maxPercentageStudent = null;
// double maxPercentage = 0;
// Student minPercentageStudent = null;
//
// for (Student student : students) {
// if (student.getPercentage() > maxPercentage) {
// maxPercentage = student.getPercentage();
// maxPercentageStudent = student;
// }
// }
//
// System.out.println("Student with maximum percentage " +
// maxPercentageStudent);
//
//
// for (Student student : students) {
// if (student.getPercentage() < maxPercentage) {
// maxPercentage = student.getPercentage();
// minPercentageStudent = student;
// }
// }
//
// System.out.println("Student with minimum percentage " +
// minPercentageStudent);
//
