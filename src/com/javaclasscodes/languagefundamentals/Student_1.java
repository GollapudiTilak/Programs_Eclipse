package com.javaclasscodes.languagefundamentals;

import java.util.Scanner;

//4 8 7 10 9 12 6 11 14 --> 15
public class Student_1 {

	static String $college_Name = "Vcube";
	static int college_id = 111;
	int var = 10;

	int student_id;
	String student_Name;

	public static void main(String[] $args) {

		Scanner sc = new Scanner(System.in);
		var a = 10;
		var b = "sri";

		System.out.println("main method started !");
		Student_1 s1 = new Student_1();
		System.out.println(s1.student_id);
		System.out.println(s1.student_Name);

		System.out.println($college_Name);
		s1.show$();
	}

	void show$() {
		System.out.println("Show method called ");
	}

}