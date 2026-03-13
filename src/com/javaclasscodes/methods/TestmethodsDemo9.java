package com.javaclasscodes.methods;

//SRS : Service Requirement Specification
interface In1 {
	// Abstract methods do not specify a body
//	void method1() {
//		
//	}

	public abstract void method2();// abstract method: which does not provide implementation
}

class Student {
	String name;
}

public class TestmethodsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Student s1 = createStudent();
		s1.name = "Ramesh";
		System.out.println(s1.name);

	}

	// Factory methods
	static Student createStudent() {
		Student s = new Student();
		return s;
	}
}