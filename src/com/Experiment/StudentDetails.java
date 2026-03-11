package com.Experiment;

import java.util.*;

class Main {
	int id;
	String name;

	// Parameterized constructor
	Main(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println();
		System.out.println("***** Student Details *****");
		System.out.println("Student ID : " + id);
		System.out.println("Name of the Student : " + name);
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID: ");
		int id = sc.nextInt();

		System.out.print("Enter Name: ");
		String name = sc.next();

		Main s1 = new Main(id, name);

		s1.display();
	}
}
