package com.in28minutes.java.beginner.junit.examples.variables;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class AnonymousClassTest {
	// To keep it simple lets consider Student
	// with one member variable marks.
	// We would like to sort students by marks.
	class Student {
		private int marks;

		Student(int marks) {
			this.marks = marks;
		}

		public int getMarks() {
			return marks;
		}

		public String toString() {
			return String.valueOf(marks);
		}

		@Override
		public boolean equals(Object paramObject) {
			if (!(paramObject instanceof Student))
				return false;
			return this.marks == 
					((Student) paramObject).getMarks();
		}
	}

	@Test
	public void sortStudents() {
		List<Student> students = Arrays.asList(new Student(80),
				new Student(70), new Student(75));

		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				return student1.marks - student2.marks;
			}
		});

		List<Student> sortedStudents = Arrays.asList(new Student(70),
				new Student(75), new Student(80));

		assertEquals(sortedStudents, students);

	}
}
