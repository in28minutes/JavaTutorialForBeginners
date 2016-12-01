package com.in28minutes.java.beginner.junit.examples.primitivedatatypes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CharacterTest {
	class CharacterExample {
		public boolean isVowel(char character) {
			char upperCharacter = Character.toUpperCase(character);
			// Can use a character array for this. Lets look at it
			// in the next example
			if (upperCharacter == 'A' || upperCharacter == 'E'
					|| upperCharacter == 'I' || upperCharacter == 'O'
					|| upperCharacter == 'U') {
				return true;
			}
			return false;
		}
	}

	@Test
	public void testIsVowel() {
		CharacterExample example = new CharacterExample();
		assertEquals(true, example.isVowel('A'));
		assertEquals(true, example.isVowel('e'));
		assertEquals(false, example.isVowel('D'));
	}

	static class CharacterArrayExample {

		Character[] vowels = { 'A', 'E', 'I', 'O', 'U' };

		public boolean isVowel(char character) {
			char upperCharacter = Character.toUpperCase(character);
			if (Arrays.asList(vowels).contains(upperCharacter)) {
				return true;
			}
			return false;
		}
	}

	@Test
	public void testIsVowelArray() {
		CharacterArrayExample example = new CharacterArrayExample();
		assertEquals(true, example.isVowel('A'));
		assertEquals(true, example.isVowel('e'));
		assertEquals(false, example.isVowel('D'));
	}

	@Test
	public void convertCharArrayToString() {
		char[] charArray = new char[] { 'a', 'b', 'c', 'd' };
		assertEquals("abcd", String.valueOf(charArray));
	}

	@Test
	public void convertCharArrayToStringOption2() {
		char[] charArray = new char[] { 'a', 'b', 'c', 'd' };
		assertEquals("abcd", new String(charArray));
	}

	@Test
	public void convertCharacterToString() {
		Character ch = new Character('a');
		String str = String.valueOf(ch);
		assertEquals("a", str);
	}

	@Test
	public void convertCharacterToStringApproach2() {
		Character ch = new Character('b');
		String str = Character.toString(ch);
		assertEquals("b", str);
	}

	@Test
	public void convertCharToString() {
		char ch = 'a';
		String str = String.valueOf(ch);
		assertEquals("a", str);
	}

	@Test
	public void convertCharToStringApproach2() {
		char ch = 'b';
		String str = Character.toString(ch);
		assertEquals("b", str);
	}

	@Test
	public void convertCharToIntStep1() {
		int ASCII_VALUE_1 = 49;
		char ch = '1';
		int i = ch;
		assertEquals(ASCII_VALUE_1, i);
	}

	@Test
	public void directConversionCharToInt() {
		char ch = '1';
		int i = ch - 48; // ch - '0';
		assertEquals(1, i);
		// Assumes char contains only numbers
		// To check invalid values add
		//if(ch < '0' || ch > '9')
		//     throw new RuntimeException("Invalid Value");
	}

}
