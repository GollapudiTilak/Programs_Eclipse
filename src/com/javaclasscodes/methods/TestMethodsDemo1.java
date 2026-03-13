package com.javaclasscodes.methods;

//1) no argument + no return type 
public class TestMethodsDemo1 {

	// instance method
	// no return type + no arguments
	void greet() {
		System.out.println("Good morning, Have great a day !");
		System.out.println("Off-line classes best  !");
		System.out.println("If you attend online, you may sleepy or you ignore classes  !");
		System.out.println("If you attend online, You are not serious about your job");

	}

	static void welcome() {
		System.out.println("Welcome to Methods !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

//		Cannot make a static reference to the non-static method greet() from the type TestMethodsDemo1
//		greet();//calling the method

//		If we want to call instance methods inside a static area, 
//		we must need to create an Object of a class and we can call by using Object reference variable.

		TestMethodsDemo1 t1 = new TestMethodsDemo1();
		t1.greet();

//		static methods we can call directly
//		And also we can call by using class name
		welcome();
		TestMethodsDemo1.welcome();
//		The static method welcome() from the type TestMethodsDemo1 should be accessed in a static way
		t1.welcome();//

		System.out.println("main method ended !");

	}

}