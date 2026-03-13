package com.javaclasscodes.languagefundamentals;

//Whenever we want to share the data to all the objects then will use "static" for data members.
//Whenever the data is changing from Object to Object then we keep the data members as "instance."
public class Student2 {

	// primitive + instance variable
	int id;

	// Object + instance variable
	String name;

	// Primitive + static variable
	static int collegId = 55;

	// Object + static variable
	static String CollegeName = "Vcube";

	public static void main(String[] args) {
		System.out.println("main method started !!");
//		Object Creation to access instance data members
		Student2 s1 = new Student2();
		System.out.println(s1.id);// 0
		System.out.println(s1.name);// null

//		We cannot access instance data through class name.
//		Cannot make a static reference to the non-static field Student2.id
//		System.out.println(Student2.id);

		System.out.println("Accessing static data !!************");
		// Accessing static data directly..
		System.out.println(collegId);
		System.out.println(CollegeName);

		// static data members we can access by using class name also.
		// Sometime, we need to access the static data outside of the
		// class then we must need to access through Class name.
		// Accessing static data through class name is always recommended.
		System.out.println(Student2.collegId);
		System.out.println(Student2.CollegeName);

		// static data we can access by using Object Reference variable also.
		// Warning : The static field Student2.collegId should be accessed in a static
		// way
		System.out.println(s1.collegId);
		System.out.println(s1.CollegeName);

	}

}