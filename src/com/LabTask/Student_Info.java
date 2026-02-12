package com.LabTask;

public class Student_Info {
	String student_Name;
	static int student_Id = 0;
	int student_Age;
	char student_Gender;
	int student_Marks;

	int math;
	int physics;
	int chemistry;
	int english;
	int telugu;
	int hindi;
	int social;
	{
		student_Id++;
	}

	public static void main(String[] args) {
		System.out.println("Student Information");
		System.out.println();
		Student_Info student = new Student_Info();
		student.student_Name = "Tilak";
		student.student_Age = 23;
		student.student_Gender = 'M';

		student.telugu = 90;
		student.hindi = 75;
		student.english = 88;
		student.math = 85;
		student.physics = 90;
		student.chemistry = 78;
		student.social = 92;

		student.display();

		System.out.println();
		Student_Info student1 = new Student_Info();
		student1.student_Name = "Nava Bharath";
		student1.student_Age = 23;
		student1.student_Gender = 'M';

		student1.telugu = 100;
		student1.hindi = 75;
		student1.english = 90;
		student1.math = 80;
		student1.physics = 90;
		student1.chemistry = 90;
		student1.social = 90;

		student1.display();

	}

	void display() {

		int sum = telugu + hindi + english + math + physics + chemistry + social;
		double average = sum / 7.0;

		System.out.println("Name of the Student : " + student_Name);
		System.out.println("Age of the Student : " + student_Age);
		System.out.println("Gender of the Student : " + student_Gender);
		System.out.println("Student Id : " + student_Id);

		System.out.println("\nSubject Marks:");
		System.out.println("Computer : " + telugu);
		System.out.println("English : " + hindi);
		System.out.println("English : " + english);
		System.out.println("Math : " + math);
		System.out.println("Physics : " + physics);
		System.out.println("Chemistry : " + chemistry);
		System.out.println("English : " + social);

		System.out.println("\nTotal Marks : " + sum);
		System.out.println("Average Marks : " + average);
	}

}
