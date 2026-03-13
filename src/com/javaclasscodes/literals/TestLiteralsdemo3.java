package com.javaclasscodes.literals;

//Char Literals 
//String Literals
//boolean Literals
//null Literals 
public class TestLiteralsdemo3 {

	public static void main(String[] args) {

		System.out.println("main method started ");

//		int a = null;//invalid //Type mismatch: cannot convert from null to int
//		null is a literal, We can store for only object data types whenever we dont want to share any values.
//		The purpose,Whenever we want to change the value later then we can give starting with null for any Object data type.
//		null true & false looks like a keywords but not the keywords.

		String s = null;
		Integer i1 = null;
		TestLiteralsdemo3 t1 = null;
		String s1 = "null";
//		Integer i2 = "null";//Type mismatch: cannot convert from String to Integer
		
		t1 = new TestLiteralsdemo3();

		// In boolean we can store either true or false nothing else.
		boolean boo = true;
		boolean boo1 = false;

		if (boo) {
			System.out.println("Good morning guys have a nice day !!");
		}

		if (boo1) {
			System.out.println("Good afternoon !! ");
		}

		// Collection of characters storing into a double quotes will consider as String
//		String s1 = "Srikanth"; // String Literals --> SCP : String Constant Pool
		String s2 = "Srikanth";
		String s3 = new String("Srikanth");// --> Heap area directly

		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true

		// Character can store 0 to 65535
		char c1 = 'A';// Single Quote characters
		char c2 = 65;// ASCII values
		char c3 = '\u0040';// unicode characters
		char c4 = 126;
		char c5 = 1234;// Junk characters

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

	}

}