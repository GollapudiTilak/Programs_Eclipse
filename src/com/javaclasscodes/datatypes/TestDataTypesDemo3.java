package com.javaclasscodes.datatypes;

import java.math.BigInteger;
import java.math.BigDecimal;

class Car {
	String name = "KIA";
}

class Dog {
	String name = "Puppy";
}

public class TestDataTypesDemo3 {

	// Type mismatch: cannot convert from int to BigInteger
//	BigInteger bi = 100;
//	BigDecimal bd = 200;

	String s1 = "SrikanthJava";// String Literals
	String s2 = new String();
	String s3 = new String("Java is simple");// String with new keyword

	String s4;
	Integer i3;
	BigInteger bi3;
	BigDecimal bd3;
	Character c3;
	Float f3;
	Double d3;
	Boolean b3;

//	Car car ="Sonet";//System.out.println(t3.car);
	Dog dog;

	BigInteger bi1 = new BigInteger("656754638387563475345634875643875674365");
	BigInteger bi2 = new BigInteger("656754638387563475345634875643875674365");

	BigDecimal bd1 = new BigDecimal(
			"987654235789087654345678907654356789097654890965456789976543567865789076546879.57432587908765433567890876546789087654678");
	BigDecimal bd2 = new BigDecimal(
			"987654235789087654345678907654356789097654890965456789976543567865789076546879.57432587908765433567890876546789087654678");

	public static void main(String[] args) {
		System.out.println("main method started !");

		TestDataTypesDemo3 t3 = new TestDataTypesDemo3();

		System.out.println(t3.s1);
		System.out.println(t3.s2);
		System.out.println(t3.s3);
		System.out.println(t3.s4);
		System.out.println();
		System.out.println(t3.i3);
		System.out.println(t3.bi3);
		System.out.println(t3.bd3);
		System.out.println(t3.c3);
		System.out.println(t3.f3);
		System.out.println(t3.d3);
		System.out.println(t3.b3);
//		System.out.println(t3.car);
		System.out.println(t3.dog);
		System.out.println("---------------------------");

		System.out.println(t3.bi1);
		System.out.println(t3.bi2);

//		The operator + is undefined for the argument type(s) 
//		java.math.BigInteger, java.math.BigInteger
//		System.out.println(t3.bi1 + t3.bi2);

		System.out.println(t3.bi1.add(t3.bi2));
		System.out.println(t3.bi1.multiply(t3.bi2));

		System.out.println("*****************");
		System.out.println(t3.bd1.add(t3.bd2));
		System.out.println(t3.bd1.multiply(t3.bd2));

		System.out.println("*********************");
		System.out.println(t3.s1);

	}

}