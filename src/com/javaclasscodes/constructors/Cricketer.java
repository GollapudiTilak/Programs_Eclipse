package com.javaclasscodes.constructors;

//Note : In Java, If the program does not contain any explicit Constructors 
//then Java Compiler will create a constructor name called default constructor.

//ex: default constructor looks like below
//syntax : public Cricketer(){ 
//}

public class Cricketer {

	int jno;
	String name;

	// no-arg constructor
	Cricketer() {
		System.out.println("No-arg constructor called !");
	}

	{
		System.out.println("instance block called !");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		Note1:  The below Object is created with the help of default constructor.
//		Whenever the class does not contains any other constructors then Java
//		Compiler will create default constructor.

//		Note 2: The below Object is created with the help of no-arg constructor.
//		Whenever the class contains any constructor then Java compiler will not create 
//		default constructor, now we have explicit no-arg constructor SO, the below object is created with the help of no-arg constructor.
		Cricketer c1 = new Cricketer();// Cricketer() --> constructor calling
		c1.jno = 9;
		c1.name = "Sanju Samson";
		System.out.println(c1.jno);
		System.out.println(c1.name);

		// The constructor Scanner() is undefined
//		Scanner sc = new Scanner();

		System.out.println("main method ended ");
	}
}