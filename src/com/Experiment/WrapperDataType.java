package com.Experiment;

public class WrapperDataType {

	public static void main(String[] args) {
		byte b1 = 10;
		Byte b2 = b1;
		System.out.println(b2);

		int i1 = 10;
		Integer i2 = i1;
		System.out.println(i2);

		// Wrapper Data Type will accept only same Primitive Data Types Only.
		// Integer i3 = b2;
		// System.out.println(i3);

		Integer i4 = 127;
		Integer i5 = 127;
		System.out.println(i4 == i5); // Both are same --> true
		// Two different objects are created and == compares references.

		// == compares object references (memory addresses).
		// 200 is outside the Integer cache range (-128 to 127).
		// So Java creates two different objects.
		// Different objects → different references → false

		Integer i6 = 200;
		Integer i7 = 200;
		System.out.println(i6 == i7); // Both are not same --> false
		// i6 == i7 is false because 200 is outside that cache range. So, two different
		// objects are created and == compares references.
		System.out.println(i6.equals(i7));
		// This line compares the actual integer values inside the Integer objects and
		// prints the result (true or false), instead of comparing their memory
		// references like == does.

		boolean boo = true; // boo is a primitive boolean.
		Boolean boo1 = boo; // Boolean boo1 = boo; → autoboxing happens.

		// Java converts primitive boolean into a Boolean object.

		System.out.println(boo1);
	}

}
