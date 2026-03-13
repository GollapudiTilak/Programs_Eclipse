package com.javaclasscodes.languagefundamentals;

class Singleton {

	public static Singleton instance;// null

	private Singleton() {
		System.out.println("constructor called ");
	}

	static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();// obj3456
		}
		return instance;

	}
}

public class Test {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();//
		Singleton s2 = Singleton.getInstance();//
		Singleton s3 = Singleton.getInstance();//
		Singleton s4 = Singleton.getInstance();//

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println(s1 == s2);

	}

}