package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student(11, "Amisha", 99, Arrays.asList("reading", "talking", "singing")),
				new Student(13, "Suraj", 95, Arrays.asList("dancing", "cooking", "singing")),
				new Student(19, "Nikhil", 93, Arrays.asList("reading", "playing", "singing")),
				new Student(33, "Vikram", 97, Arrays.asList("reading", "walking", "roaming")),
				new Student(44, "Riya", 94, Arrays.asList("reading", "eating", "singing")));

		List<Student> maxPercentage = students.stream()
				.sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
				.limit(1)
				.collect(Collectors.toList());

		maxPercentage.forEach(System.out::println);

		List<String> hobbies = students.stream()
				.map((student) -> student.getHobbies())
				.flatMap((list) -> list.stream())
				.distinct()
				.collect(Collectors.toList());

		System.out.println(hobbies);

	}

}
