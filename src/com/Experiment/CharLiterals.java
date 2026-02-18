package com.Experiment;

public class CharLiterals {

	// Decimal integer literals (must be within 0–65535)
	char c1 = 65; // 'A'
	char c2 = 97; // 'a'
	char c3 = 48; // '0's
//    char x = 70000;     // Cannot assign int to char
//    char y = 65.0;      // Cannot assign double to char
//    char z = -1;        // Cannot assign int to char

	// Octal integer literal
	char c4 = 0101; // Octal 0101 → decimal 65 → 'A'

	// Hexadecimal integer literal
	char c5 = 0x41; // Hex 0x41 → decimal 65 → 'A'

	// ASCII character literals
	char c6 = 'A'; // ASCII 65
	char c7 = 'a'; // ASCII 97
	char c8 = '0'; // ASCII 48

	// Unicode escape sequences
	char c9 = '\u0041'; // Unicode for 'A'
	char c10 = '\u03A9'; // Unicode Ω
	char c11 = '\u20B9'; // Unicode ₹

	public static void main(String[] args) {

		CharLiterals c = new CharLiterals();

		System.out.println(c.c1);
		System.out.println(c.c2);
		System.out.println(c.c3);
		System.out.println(c.c4);
		System.out.println(c.c5);
		System.out.println(c.c6);
		System.out.println(c.c7);
		System.out.println(c.c8);
		System.out.println(c.c9);
		System.out.println(c.c10);
		System.out.println(c.c11);
	}
}
