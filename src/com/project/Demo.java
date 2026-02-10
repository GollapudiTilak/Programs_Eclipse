package com.project;

public class Demo {
	static {
		Demo d = new Demo();
		d.darling();
	}

	static void hi() {
		System.out.println("Static Method 1");
		hello();
	}

	static void hello() {
		System.out.println("Static Method 2");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");

	}

	void darling() {
		System.out.println("Instance Method 1");
		hi();
		cube();
	}

	void cube() {
		System.out.println("Instance Method 2");
	}

}
