package com.LabTask.constructors;

// Create a class Student with a constructor that initializes the student's name and age, then display the details.
public class Student {
	String stdname;
	int stdage;
	int stdid;

	public Student(String stdname, int stdage, int stdid) {
		this.stdname = stdname;
		this.stdage = stdage;
		this.stdid = stdid;
	}

	public static void main(String[] args) {
		Student s = new Student("G.Thilak", 23, 501);
		s.getStudent();
	}

	void getStudent() {
		System.out.println("Name Of The Student  : " + stdname);
		System.out.println("Age of The Student   : " + stdage);
		System.out.println("Id Number            : " + stdid);
	}

}
