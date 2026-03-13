package com.javaclasscodes.methods;

import java.util.Scanner;

public class TestMethodsDemo8 {

	static String showAkash(String name) {
		return name + "- India";
	}

	static int getAge(int age) {
		return age;
	}

	static char getGeder(char c) {
		return c;
	}

	static int method1() {
		return 'A';
	}

	static char method2() {
		int a = 65;
		return (char) a;
	}

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age : ");
		int age = sc.nextInt();

		System.out.println("Enter a name : ");
		sc.nextLine();
		String nm = sc.nextLine();

		System.out.println("Enter a Gender");
		char gender = sc.next().charAt(0);// Method chaining

		System.out.println(method1());
		System.out.println(method2());
		System.out.println(getGeder(gender));
		System.out.println(showAkash(nm));
		System.out.println(getAge(age));

		sc.close();
		System.out.println("main method ended ");

	}

}