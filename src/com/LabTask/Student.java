package com.LabTask;

import java.util.*;

public class Student {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student s = new Student();

		System.out.print("Enter Your Roll Number: ");
		short rollNumber = sc.nextShort();
		sc.nextLine();

		System.out.print("Enter Student Name: ");
		String nameInput = sc.nextLine();

		System.out.print("Enter Gender (M/F): ");
		char genderInput = sc.next().charAt(0);
		sc.nextLine();

		System.out.print("Enter Address: ");
		String addressInput = sc.nextLine();

		System.out.print("Enter marks for Subject 1: ");
		int mark1 = sc.nextInt();

		System.out.print("Enter marks for Subject 2: ");
		int mark2 = sc.nextInt();

		System.out.print("Enter marks for Subject 3: ");
		int mark3 = sc.nextInt();


		String name = s.getStudentName(nameInput);
		char gender = s.getGender(genderInput);
		String address = s.getAddress(addressInput);
		int totalMarks = s.getTotalMarks(mark1, mark2, mark3);
		double percentage = s.calculatePercentage(totalMarks, 300);

		System.out.println();
		System.out.println("----- Student Details -----");
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Student Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Address: " + address);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Percentage: " + percentage + "%");

		sc.close();
	}

	String getStudentName(String name) {
		return name;
	}

	char getGender(char gender) {
		return gender;
	}

	String getAddress(String address) {
		return address;
	}

	int getTotalMarks(int m1, int m2, int m3) {
		return m1 + m2 + m3;
	}

	double calculatePercentage(int totalMarks, int maxMarks) {
		return (totalMarks * 100.0) / maxMarks;
	}
}