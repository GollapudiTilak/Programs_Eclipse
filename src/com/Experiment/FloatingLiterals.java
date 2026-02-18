package com.Experiment;

public class FloatingLiterals {

	float f1 = 100; // 100.0
//	float f2=100.0;//Type mismatch: cannot convert from double to float.
	float f3 = 0123; // 83.0
	float f4 = 123F; // 123.0
//	float f5=123.5;//Type mismatch: cannot convert from double to float
	float f6 = 123.5F; // 123.5
	float f7 = 0x123;// Hexa --> int -->float 291.0
//	float f7a = 0123.5;//Type mismatch: cannot convert from double to float
	float f8 = 0123.5F;// Float --> float, Here Octal don't convert. 123.5
//	float f9=0x123.5F;//Invalid hex literal number because It doesnot know(Confusses) that 'F' should take as Float or Hexa Decimal.
	float f10 = 0x123F; // 4671.0
	float f11 = 1230.5F; // 1230.5

	public static void main(String[] args) {
		FloatingLiterals f = new FloatingLiterals();
		System.out.println(f.f1);
		System.out.println(f.f3);
		System.out.println(f.f4);
		System.out.println(f.f6);
		System.out.println(f.f7);
		System.out.println(f.f8);
		System.out.println(f.f10);
		System.out.println(f.f11);

	}

}
