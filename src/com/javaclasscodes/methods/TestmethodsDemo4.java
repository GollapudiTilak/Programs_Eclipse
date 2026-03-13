package com.javaclasscodes.methods;

public class TestmethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Student information : ");

		TestmethodsDemo4 t4 = new TestmethodsDemo4();
		System.out.println("Student ID : " + t4.getStudentId());
		System.out.println("Student Name : " + t4.getStudentName());
		System.out.println("Student Age : " + t4.getStudentAge());
		System.out.println("Student Gender : " + t4.getStudentGender());
		System.out.println("Student Height : " + t4.getStudentHeight());
		System.out.println("Student Weight : " + t4.getStudentWeight());
		System.out.println("Student Rank : " + t4.getStudentRank());
		System.out.println("Pass status : " + t4.isStudentPassed());

	}

	byte getStudentId() {
		return 101;
	}

	short getStudentAge() {
		short age = 23;
		return age;
	}

	int getStudentRank() {
		int rank = 5;
		return rank;
	}

	float getStudentHeight() {
		float height = 5.9F;
		return 100;
	}

	double getStudentWeight() {
		double weight = 65.5;
		return weight;
	}

	char getStudentGender() {
		char gen = 'M';
		return gen;
	}

	boolean isStudentPassed() {
		boolean status = true;
		return status;
	}

	String getStudentName() {
		String name = "RajKumar";
		return name;
	}

}