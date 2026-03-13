package com.javaclasscodes.datatypes;

public class TestDataTypeDemo2 {

	public static void main(String[] args) {

		int i = 10;

//		 Converting primitive to Wrapper is Called "Auto-Boxing"
		Integer i1 = i;
		System.out.println(i1);

		Integer i2 = 100;// Primitive value to Wrapper is Called Auto-Boxing
		int i3 = i2;// Converting Wrapper Object data to primitive is called "Auto-Unboxing"

		System.out.println(i3);

		byte b1 = 10;
		Byte b2 = b1;
		System.out.println(b2);

//		Integer i3 = b2;
//		System.out.println(i3);

//		 The cache range is -128 to 127 only
		Integer i4 = 127;
		Integer i5 = 127;

		// == Operators always compare the addresses of the Object
		// In the case of i4 & i5 only one Object created and its using same cache.
//		SO we will get true.
		System.out.println(i4 == i5);// both are same --> true

		// i6 & i7 will 2 different objects, so will get false
		Integer i6 = 200;
		Integer i7 = 200;
		System.out.println(i6 == i7);// both are not same --> false

	}

}