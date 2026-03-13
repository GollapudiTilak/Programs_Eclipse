package com.javaclasscodes.literals;

//Floating Literals 
//byte --> short --> int --> long --> float --> double 

public class TestLiteralsDemo2 {

	public static void main(String[] args) {

		float f1 = 100;
		float f2 = 0123;// octal--> int --> float
		float f3 = 123F;
//		float f4 = 123.5;//invalid : double cannot covert to float 
		float f5 = 123.5F;
		float f6 = 0x123;// Hexa --> int --> float
//		float f7 = 0123.5;//Type mismatch: cannot convert from double to float
		float f7a = 0123.5F;// Float --> float --> 123.5
//		float f8 = 0x123.5F;//Invalid hex literal number
		float f9 = 0x123F;
		float f10 = 1230.5F;
//		float f11 = 

		System.out.println(f1);// 100.0
		System.out.println(f2);// 83.0
		System.out.println(f3);// 123.0
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7a);
		System.out.println(f9);
		System.out.println(f10);

	}

}