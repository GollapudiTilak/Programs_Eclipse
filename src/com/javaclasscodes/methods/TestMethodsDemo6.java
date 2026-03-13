package com.javaclasscodes.methods;

import java.util.Scanner;

public class TestMethodsDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		// In Scanner class, no no-arg constructor, so we are unable to create object
		// for Scanner directly.
		// So we must need to pass arguments.
//		Scanner sc = new Scanner();

//		Constructs a new Scanner that produces values scanned from the specified input stream.
		// To Read the elements form Console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age  : ");
		int age = sc.nextInt();

		System.out.println("Enter your First name : ");
		String fname = sc.next();

		System.out.println("Enter your last Name : ");
		String lname = sc.next();

		TestMethodsDemo6 t = new TestMethodsDemo6();
		t.getEmployeeAge(age);
		t.getEmployeeFullName(fname, lname);

		sc.close();

	}

	void getEmployeeAge(int age) {
		System.out.println("Employee age is : " + age);
	}

	void getEmployeeFullName(String fn, String ln) {
		System.out.println("The full name of Employee is : " + fn + " " + ln);
	}

}