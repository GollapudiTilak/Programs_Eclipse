package com.LabTask;

public class Methods {

	public static void main(String[] args) {
		Method(5, 10);
	}

	static void Method(int a, int b) {
		int c = a + b;
		System.out.println("Addition: " + c);

		Methods m = new Methods();
		m.Method1(5, c);
	}

	void Method1(int a, int c) {
		int d = a * c;
		System.out.println("Multiplication: " + d);

		Method2(5, d);
	}

	static void Method2(int a, int d) {
		int e = d - a;
		System.out.println("Subtraction: " + e);

		Methods m = new Methods();
		m.Method3(4, e);
	}

	void Method3(int a, int e) {
		int f = e / a;
		System.out.println("Division: " + f);
	}
}