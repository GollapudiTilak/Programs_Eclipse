package com.Experiment;

public class IntegrialLiterals {
	public static void main(String[] args) {
		// Decimal Literals (base 10)
		int a1 = 10;
		int a2 = 123;
		// Octal Decimal Literals(base 8).
		// Represented as 0.
		int a3 = 0674;
		int a4 = 0123;// How it calculates the Octal Decimal Literals.
		// 1*8^2 + 2*8^1 + 3*8^0
//		int a5=0875; //The literal 0875 of type int is out of range.

		// Hexa Decimal Literals (base 16).
		// Represented as 0x or 0X.
		int a5 = 0x123; // Hexa Decimals contain number 0 to 9, and Remaining are alphabets a-z or A-Z.

		// Binary Decimal Literals (base 2).
		// Represented as 0b.
		int a6 = 0b1010; // Binary Decimals contain only 0 & 1.
		int a7 = 0b10111;

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
	}

}
