package com.javaclasscodes.datatypes;

//Java is not 100% Object oriented programming language because of primitive data types.
//
//byte --> short --> int --> long 
public class TestDataTypesDemo1 {
//	If we give, more than byte value we will get below Compile Time Error.
//	CE : Type mismatch: cannot convert from int to byte
//	By default RHS numerical value is int.
	byte b = 127;// -128 to 127
	byte b1 = -128;

	// -128 -127 -126 -125 -124 ..... 0 1 2 3 4 5..... 124 125 126 127
//	Type Casting : converting one data type value into another data type.
	// Converting int data type to byte.
	byte b2 = (byte) 256;// Explicit Type casting --> 127 128 --> -128

//	if we give more than 32767 will get 
//	Range for short : -32768 to 32767 --> 2^-15 to 2^15
//	CE--> Type mismatch: cannot convert from int to short
	short s = (short) 32767;// 2 bytes --> 32767

//	Range for int --> -2^31 to 2^31 --> -2147483648 --> 2147483647 
	int i = b;// converting byte into into --> implicit type casting
	int i1 = 100;

	// The literal 2147483648 of type int is out of range
	// Type mismatch: cannot convert from long to int: when the value is in long
	int i2 = 2147483647;

	// Range for long --> -2^63 to 2^63 --> 9223372036854775807
	long l = 9223372036854775807L;

	// Decimal point data types
	// By default RHS values is double.
	// Whenever we want to represent 5-6 decimal points then go for float.
	float f = 5.9f;
	double d = 40000.00D;

	float f1 = 564536.47565354365F;
	double d1 = 564536.47565354365;

	float f2 = (float) 4353454.875655467;
	float f3 = 9223372036854775806756465F;

	//// To single characters will use char
	/// -32768 + 32767= 65535
	/// The Range is 2 bytes = 16 bits - 0 to 65535
	char c = 'A';
//	 Can we store numerical values into char ..? Yes we can store 
//	 It will consider as ASCII values
//	A-Z = 65 to 90 
//	a-z = 97 to 122
	char c1 = 72;// int can convert to char : Implicit type casting
	char c2 = '\u0040';// Unicode or hex characters
//	char c3 = 'Sri';//Invalid character constant

	int i3 = 'A';// char to int //: Implicit type casting

	boolean areYouGiving90A = false;

	// the below values are invalid
//	boolean boo1 = 0;
//	boolean boo2 = 1;
//
//	boolean boo3 = TRUE;
//	boolean boo4 = FALSE;
//
//	boolean boo5 = "TRUE";
//	boolean boo6 = "FALSE";
//
//	boolean boo7 = False;
//	boolean boo8 = True;

	public static void main(String[] args) {
		System.out.println("main method started !");
		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();

		System.out.println("byte value : " + t1.b);// 0
		System.out.println("byte value : " + t1.b1);
		System.out.println("byte value : " + t1.b2);

		System.out.println("short value : " + t1.s);// 0
		System.out.println("int value:  " + t1.i);// 0
		System.out.println("int value:  " + t1.i1);// 0
		System.out.println("int value:  " + t1.i2);// 0
		System.out.println("int value:  " + t1.i3);// 0

		System.out.println("long value : " + t1.l);// 0

		System.out.println("float value : " + t1.f);// 0.0
		System.out.println("double value " + t1.d);// 0.0

		System.out.println("*******************************");
		System.out.println("float1 value : " + t1.f1);// 0.0
		System.out.println("double1 value " + t1.d1);// 0.0
		System.out.println("float value " + t1.f2);// 0.0
		System.out.println("float value " + t1.f3);// 0.0

		System.out.println("char value : " + t1.c);//
		System.out.println("char1 value : " + t1.c1);//
		System.out.println("char2 value : " + t1.c2);//
		System.out.println("boolean value :" + t1.areYouGiving90A);// false

		if (t1.areYouGiving90A) {
			System.out.println("You will get job in 2026 First half ");
		} else {
			System.out.println("You will get a job in 2027 second half ");
		}

	}

}