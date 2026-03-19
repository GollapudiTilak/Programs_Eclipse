package com.Experiment;

//instanceof Operator
class A {

}

class B extends A {

}

public class Operators_09 {

	public static void main(String[] args) {
		Integer i1 = 10;

		// instanceof means object reference
		System.out.println(i1 instanceof Integer); // true
		System.out.println(i1 instanceof Number); // true
		System.out.println(i1 instanceof Object); // true

		String s1 = "Srikanth";
//		Incompatible conditional operand types String and Integer
//		System.out.println(s1 instanceof Integer);

		Number n = 100;
		System.out.println(n instanceof Number); // true
		System.out.println(n instanceof Integer); // true

		Number n1 = null;
		System.out.println(n1 instanceof Number); // false
		System.out.println(n1 instanceof Integer); // false

		A a = new A();
		B b = new B();
		System.out.println(a instanceof A); // true
		System.out.println(b instanceof B); // true
		System.out.println(b instanceof A); // true
		System.out.println(a instanceof B); // false

	}

}
