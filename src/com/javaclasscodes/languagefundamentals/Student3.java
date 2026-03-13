package com.javaclasscodes.languagefundamentals;

public class Student3 {

	int id = 10;

	// static variable
	static String collegeName = "VSS";

	public static void main(String[] args) {
//		For local variables, JVM will not provide default values
//		Whenever we access local variable, 
//		the variable must be assigned otherwise we will get CE.
//		Why local variables ..? to maintain temporary data.
//		Note : if we use static : CE:  Illegal modifier for parameter id; only final is permitted
//		For local variables we can use only one modifier which is "final", 
//		we cannot use any other modifier or access modifier.
		String collegeName = "SSS";

		int id = 9;
		int x;
//		System.out.println(x);//The local variable x may not have been initialized
		x = 100;
		System.out.println(x);

		System.out.println("main method started from Student3 ");
		// Accessing local variable
		System.out.println(collegeName);
		System.out.println(id);

		Student3.collegeName = "AnSS";
		// Accessing static data
		System.out.println("College Name : " + Student3.collegeName);

	}

}