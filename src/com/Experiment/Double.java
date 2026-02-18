package com.Experiment;

public class Double {

	double d1 = 100; // int → double → 100.0
	double d2 = 100.0; // double literal → 100.0
	double d3 = 0123; // Octal 0123 → decimal 83 → 83.0
	double d4 = 123D; // Explicit double literal → 123.0
	double d5 = 123.5; // Decimal literals are double by default → 123.5
	double d6 = 123.5D; // Explicit double → 123.5
	double d7 = 0x123; // Hex 0x123 → decimal 291 → 291.0
	double d8 = 0123.5; // NOT octal. Treated as decimal 123.5
	// double d9 = 0x123.5; // Invalid: hex floating point needs exponent (p)

	double d10 = 0x123F; // Hex 0x123F → decimal 4671 → 4671.0

	// Valid hexadecimal floating-point literal (Java supports this)
	double d11 = 0x1.23p2; // (1 + 2/16 + 3/256) × 2²

	public static void main(String[] args) {
		Double d = new Double();
		System.out.println(d.d1);
		System.out.println(d.d2);
		System.out.println(d.d3);
		System.out.println(d.d4);
		System.out.println(d.d5);
		System.out.println(d.d6);
		System.out.println(d.d7);
		System.out.println(d.d8);
		System.out.println(d.d10);
		System.out.println(d.d11);
	}

}
