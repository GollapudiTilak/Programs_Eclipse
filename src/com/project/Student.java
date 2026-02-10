package com.project;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Connecting to Database");
//		Class.forName("com.project.Student");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class Loaded Sucessfully");
	}

}
