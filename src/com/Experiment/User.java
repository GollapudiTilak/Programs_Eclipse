package com.Experiment;

class Address {
	int flat;
	String buildingName;
}

class Student {
	String name;
	int age;
	Address addr; // Address object inside Student
}

public class User {

	public static void main(String[] args) {
		// Creating Address object
		Address a1 = new Address();
		a1.flat = 101;
		a1.buildingName = "Green Apartments";

		// Creating Student object
		Student s1 = new Student();
		s1.name = "Rahul";
		s1.age = 16;
		s1.addr = a1; // Assigning address to student

		// Displaying data
		System.out.println("Name: " + s1.name);
		System.out.println("Age: " + s1.age);
		System.out.println("Flat: " + s1.addr.flat);
		System.out.println("Building: " + s1.addr.buildingName);

	}

}
