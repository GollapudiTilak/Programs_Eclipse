package com.javaclasscodes.literals;

//Integral Literals 
public class TestLiteralsDemo1 {

	public static void main(String[] args) {

		// Binary Literals --> Base 2 --> 0 to 1
		int a14 = 0b1010;
		int a15 = 0b10111;
		int a16 = 0b1100;

//		1*2^3 +0*2^2 +1*2^1 +0*2^0 
//		8 + 0 + 2 + 0 = 10

		System.out.println(a14);// 10
		System.out.println(a15);// 23
		System.out.println(a16);// 12
		System.out.println("*****************");

		// Hexa Decimal Literals : Base is 16 --> 0 to 9 & a-f or A-F --> a=10, b=11,
		// c=12,d=13,e=14,f=15
		// Hexa Decimal Literals, we can represent with 0X or 0x
		int a7 = 0x123;
		int a8 = 0x567;
		int a9 = 0x6789;
		int a10 = 0xabc;
		int a11 = 0X1a2b3c;
		int a12 = 0xDAD;
//		int a13 = 0xBeer;//Syntax error on token "r", delete this token

//		1*16^2 +2*16^1 +3*16^0 = 256 + 32 + 3 = 291 
		System.out.println(a7);
		System.out.println(a8);// 1383
		System.out.println(a9);// 26505
		System.out.println(a10);// 2748
		System.out.println(a11);// 1715004

		System.out.println("**********************");

		// Decimal Literals : Base is 10 --> 0 to 9 numbers we can store here.
		int a1 = 123;
		int a2 = 56789;

		System.out.println(a1);
		System.out.println(a2);

		// Octal Literals : Any number starts with 0 will consider as Octal.
		// Base is 8 --> 0 to 7 numbers we can store here.

		int a3 = 0123;
//		 1*8^2 +2*8^1 +3*8^0 = 64 + 16 + 3 = 83

		int a4 = 0345;
//		3*8^2 +4*8^1 +5*8^0 = 192 + 32 + 5 = 229

		int a5 = 0674;// 444
		// The literal 0875 of type int is out of range
//		int a6 = 0875;//573 -- 61 --> CE  

		System.out.println(a3);// 83
		System.out.println(a4);
		System.out.println(a5);

	}

}