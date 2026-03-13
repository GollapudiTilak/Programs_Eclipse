package com.javaclasscodes.constructors;

public class Student {
	String sid;
	String sname;
	int sage;

	Student() {
		System.out.println("Student no-arg constructor called ");
	}

	// Parameterized constructors
	Student(String sid, String sname, int sage) {
		System.out.println("Parameterized construcor called ");

	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		Student s1 = new Student("JFS-VC-001", "Siddu", 21);
		s1.show();

		Student s2 = new Student("JFS-VC-002", "Tilak", 22);
		s2.show();

		System.out.println("main method ended !");

	}

	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
	}

}