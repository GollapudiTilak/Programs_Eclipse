package com.Experiment;

// Bitwise Operators
public class Operator_06 {

	public static void main(String[] args) {
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false);// false

		System.out.println(72 ^ 10); // 66
		System.out.println(36 ^ 4); // 32
		System.out.println(65 ^ 6); // 71
		System.out.println(24 ^ 3); // 27

		System.out.println(~10); // Formual: -(n+1) i.e. (~10) = -(10+1)
	}

}
