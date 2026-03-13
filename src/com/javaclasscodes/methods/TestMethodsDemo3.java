package com.javaclasscodes.methods;

//no argument + with return type 
public class TestMethodsDemo3 {

	static {
		System.out.println("static block ");
	}

	// instance method
	void main() {
		System.out.println("main method started !");
		System.out.println("The Employee age is : " + getEmployeeAge());

//		double sal = getSalary();
//		double bon = getBonus();
//
//		System.out.println("Total salary is : " + (sal + bon));// BODMAS
		System.out.println("Total salary is : " + (getSalary() + getBonus()));// BODMAS
	}

	int getEmployeeAge() {
		int age = 22;
		return age;
	}

	double getSalary() {
		double salary = 500000.00;
		return salary;
	}

	double getBonus() {
		double bonus = 20000.00;
		return bonus;
	}

}