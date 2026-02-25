package com.Experiment;

//no argument + with return type
public class ReturnType {

	public static void main(String[] args) {

		ReturnType obj = new ReturnType();

		System.out.println("int value: " + obj.getIntValue());
		System.out.println("double value: " + obj.getDoubleValue());
		System.out.println("boolean value: " + obj.getBooleanValue());
		System.out.println("char value: " + obj.getCharValue());
		System.out.println("String value: " + obj.getStringValue());
	}

	// int return type
	int getIntValue() {
		return 25;
	}

	// double return type
	double getDoubleValue() {
		return 12345.75;
	}

	// boolean return type
	boolean getBooleanValue() {
		return true;
	}

	// char return type
	char getCharValue() {
		return 'A';
	}

	// String return type (Reference type)
	String getStringValue() {
		return "Java Programming";
	}
}