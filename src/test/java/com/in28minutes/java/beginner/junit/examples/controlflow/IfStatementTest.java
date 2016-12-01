package com.in28minutes.java.beginner.junit.examples.controlflow;

import static org.junit.Assert.*;

import org.junit.Test;

public class IfStatementTest {
	/*
	 * Ideally you should not use an inner class with source in a Test. This is
	 * a small test to illustrate if condition. Also not using Enums since a number
	 * of students learn Enum after if.
	 */
	class IfElseExample {
		public String getSimpleGrade(int score) {
			if (score >= 80) {
				return "A";
			} else {
				return "B";
			}
		}

		public String getComplexGrade(int score) {
			if (score >= 80) {
				return "A";
			} else if (score >= 60) {
				return "B";
			} else if (score >= 40) {
				return "C";
			} else {
				return "D";
			}
		}

	}

	@Test
	public void checkIfStatement() {
		IfElseExample example = new IfElseExample();

		assertEquals("A", example.getSimpleGrade(85));
		assertEquals("B", example.getSimpleGrade(25));
	}

	@Test
	public void checkIfElseConditions() {
		IfElseExample example = new IfElseExample();

		assertEquals("A", example.getComplexGrade(85));
		assertEquals("B", example.getComplexGrade(65));
		assertEquals("C", example.getComplexGrade(45));
		assertEquals("D", example.getComplexGrade(25));
	}

}
