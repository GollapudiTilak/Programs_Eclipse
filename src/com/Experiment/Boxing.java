package com.Experiment;

public class Boxing {

	public static void main(String[] args) {
		// Autoboxing → Primitive type → Wrapper Object.
		// Autoboxing is the automatic conversion of a primitive data type into its
		// corresponding wrapper class object.
		int x = 10; // Primitive Data Type
		Integer obj = x; // Autoboxing

		System.out.println(obj);

		// Unboxing → Wrapper Object → Primitive type.
		// Unboxing is the automatic conversion of a wrapper object → primitive type.
		Integer obj1 = 20;
		int x1 = obj1; // Unboxing
		System.out.println(x1);
	}

}
