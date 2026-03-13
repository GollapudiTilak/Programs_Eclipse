package com.javaclasscodes.languagefundamentals;

public class Student4 {

	int id;
	static String name = "Srikanth";
//	var a1 =100;//'var' is not allowed here

	public static void main(String[] args) {

		var a = 100;
		var a1 = "Ram";
		var a2 = 5.9;
		var a3 = 'A';

		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		Student4 s1 = new Student4();
		s1.id = 101;
		System.out.println(s1.id);// 101
		System.out.println(s1.name);// Srikanth

		Student4 s2 = new Student4();
		System.out.println(s2.id);// 0
		System.out.println(s2.name);// Srikanth

		Student4 s3 = null; // null . anything is NPE(NullPointerException)
		System.out.println("---" + s3.name);// bUt not for stati data
		System.out.println(s3.id);

	}

}