package com.in28minutes.java.beginners.program.examples.number;

public class CaesarCipherProgram {
	public static String caesarCipherEncode(String string,
			int shift) {
		char[] characters = string.toCharArray();
		for (int index = 0; index < string.length(); index++) {
			char ch = characters[index];
			characters[index] = encodeCharacter(ch,
					shift);
		}
		return new String(characters);
	}

	private static char encodeCharacter(char ch, int shift) {
		char chAfterEncoding = ch;
		//65-'A' 90='Z'
		if (ch >= 'A' && ch <= 'Z') {
			char chAfterShift = (char) (ch + shift);
			char chAfterShiftAdjusted = (char) (chAfterShift > 'Z' ? chAfterShift
					- ('Z' - 'A' + 1)
					: chAfterShift);
			chAfterEncoding = chAfterShiftAdjusted;
		}
		return chAfterEncoding;
	}

	public static String caesarCipherDecode(String string,
			int shift) {
		char[] characters = string.toCharArray();
		for (int index = 0; index < string.length(); index++) {
			char ch = characters[index];
			characters[index] = decodeCharacter(ch,
					shift);
		}
		return new String(characters);
	}

	private static char decodeCharacter(char ch, int shift) {
		char chAfterEncoding = ch;
		//65-'A' 90='Z'
		if (ch >= 'A' && ch <= 'Z') {
			char chAfterShift = (char) (ch - shift);
			char chAfterShiftAdjusted = (char) (chAfterShift < 'A' ? chAfterShift
					+ ('Z' - 'A' + 1)
					: chAfterShift);
			chAfterEncoding = chAfterShiftAdjusted;
		}
		return chAfterEncoding;
	}
	public static void main(String[] args) {
		System.out.println(CaesarCipherProgram
				.caesarCipherEncode(
						"ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1));//BCDEFGHIJKLMNOPQRSTUVWXYZA
		
		System.out.println(CaesarCipherProgram
				.caesarCipherDecode(
						"BCDEFGHIJKLMNOPQRSTUVWXYZA", 1));//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
		
		System.out.println(CaesarCipherProgram
				.caesarCipherEncode(
						"ABCDEFGHIJKLMNOPQRSTUVWXYZ", 5));//FGHIJKLMNOPQRSTUVWXYZABCDE
		System.out.println(CaesarCipherProgram
				.caesarCipherDecode(
						"FGHIJKLMNOPQRSTUVWXYZABCDE", 5));//ABCDEFGHIJKLMNOPQRSTUVWXYZ
	}
}
