package com.Experiment;

// Assignment Operators or Compound Operators are
// = += -= *= /= %=
public class Operators_02 {

	public static void main(String[] args) {
		Operators_02 o = new Operators_02();
		o.add();
		o.sub();
		o.mul();
	}

	void add() {
		int result = 0;
		double a = 5.5;
//		result = result +a; //Type mismatch: cannot convert from double to int
		result += a;
		System.out.println(result); // 5
	}

	void sub() {
		int result = 0;
		double b = 2.9;
//		result = result +b; //Type mismatch: cannot convert from double to int
		result -= b;
		System.out.println(result); // -2
	}

	void mul() {
		int result = 3;
		double c = 4.7;
//		result = result * c;
		result *= c;
		System.out.println("multiplication : " + result);// 9
	}

}
