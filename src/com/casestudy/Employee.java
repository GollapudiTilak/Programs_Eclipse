package com.casestudy;

import java.util.*;

public class Employee {
	String name;
	double basicSalary, grossSalary, netSalary, annual;

	Employee() {

	}

	public Employee(String name, double basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee name: ");
		String name = sc.nextLine();

		System.out.print("Enter basic salary: ");
		double salary = sc.nextDouble();

		Employee emp = new Employee(name, salary);

		emp.calculateSalary();
		emp.display();
		emp.displayCategory();

		sc.close();
	}

	void calculateSalary() {
//		double hra = 0.20 * basicSalary; //hra : House Rent Allowance
		double da = 0.10 * basicSalary; // da : dearness Allowance
		double tax = 0.05 * basicSalary; 

		grossSalary = basicSalary + da;
		netSalary = grossSalary - tax;
	}

	void displayCategory() {
		if (netSalary > 50000)
			System.out.println("Category: High");
		else if (netSalary >= 25000)
			System.out.println("Category: Medium");
		else
			System.out.println("Category: Low");
	}

	double annual() {
		annual = grossSalary * 12;
		return annual;
	}

	void display() {
		System.out.println("\nEmployee Name : " + name);
		System.out.println("Basic Salary    : " + basicSalary);
		System.out.println("Gross Salary    : " + grossSalary);
		System.out.println("Net Salary      : " + netSalary);
		System.out.println("Annual Salary   :"+annual());
	}
}