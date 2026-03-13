package com.javaclasscodes.datatypes;

class Student {

	int id = 101;
	String name = "Srikanth";

}

class Address {
	int flat = 123;
	String street = "KPHB";

}

public class TestDataTypesDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Student s = new Student();
		System.out.println(s.id);
		System.out.println(s.name);

		Address a = new Address();
		System.out.println(a.flat);
		System.out.println(a.street);

	}

}