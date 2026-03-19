package com.Experiment;

// Unary Operators are
// ++ -- + -
// post-increment
// pre-increment
public class Operators_03 {

	public static void main(String[] args) {
		int a = +10; // Unary plus
		System.out.println(a); // 10

		int b = -10; // Unary minus
		System.out.println(b); // -10

		int i = 10;
		int j = 5;
		System.out.println(++i); // i = i +1 = 11 (pre-increment)
		System.out.println(++j); // j = j +1 = 6 (pre-increment)
		System.out.println(i++); // i = i+1 = 12 (But prints 11)(post-increment)
		System.out.println(j++); // j = j+1 = 7 (But prints 6) (post-increment)
		System.out.println(++i); // i = i+1 = 13(pre-increment)
		System.out.println(j++); // j = j+1 = 8 (But prints 7)(post-increment)
		System.out.println(i++); // i = i+1 = 14 (pre-increments)
		System.out.println(++j); // j = j+1 = 9 (pre-increment)

		System.out.println("i Value : " + i);
		System.out.println("j Value : " + j);
		Operators_03 o = new Operators_03();
		o.display();
	}

	void display() {
		int a = 5;
		int b = 4;
		System.out.println(b++); // 4 --> 5
		System.out.println(++a); // 6
		System.out.println(b--); // 5 --> 4
		System.out.println(--b); // 3
		System.out.println(a--); // 6 --> 5
		System.out.println(b++); // 3 --> 4
		System.out.println(++b); // 5
		System.out.println(--a); // 4
		System.out.println(a - b); // -1
		System.out.println(a++); // 4
		System.out.println(--b); // 4

		System.out.println("a Value : " + a); // 5
		System.out.println("b Value : " + b); // 4

		// 5 + 4 = 9 --> 7 + 6 = 13
		System.out.println(a++ + b++ + ++a + ++b); // 22
		// 7 + 7 = 14 - 9 = 5 + 6 = 11
		System.out.println(a++ + ++b - ++a + --b); // 11
		// BOMAS Rule
		System.out.println((a++ + ++b) - (++a + --b)); // -1
	}

}
