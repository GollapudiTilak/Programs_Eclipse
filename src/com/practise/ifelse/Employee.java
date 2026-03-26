package com.practise.ifelse;

import java.util.*;

public class Employee {
	String name;
	double lpa, grossSalary, netSalary, annual, tax, basicSalary;

	Employee() {
	}

	Employee(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee name: ");
		String name = sc.nextLine();

		System.out.println("1. Enter LPA");
		System.out.println("2. Enter Monthly Salary");
		int choice = sc.nextInt();

		Employee emp = new Employee(name);

		if (choice == 1) {
			System.out.print("Enter LPA: ");
			emp.lpa = sc.nextDouble();
			emp.calculateSalary(true); // ✅ LPA input
		} else {
			System.out.print("Enter Monthly Salary: ");
			emp.basicSalary = sc.nextDouble();
			emp.calculateSalary(false); // ✅ Monthly input
		}

		emp.display();
		emp.displayCategory();

		sc.close();
	}

	void calculateSalary(boolean isLPA) {

		if (isLPA) {
			// LPA → Annual → Monthly
			annual = calculateAnnualFromLPA(lpa);
			grossSalary = annual / 12;
		} else {
			// Monthly → Annual → LPA
			grossSalary = basicSalary;
			annual = calculateAnnualFromMonthly(grossSalary);
			lpa = annual / 100000;
		}

		// Components (inside CTC)
		double da = 0.10 * grossSalary;
		double pf = 0.05 * grossSalary;

		// Tax on annual
		tax = 0.05 * annual;
		double monthlyTax = tax / 12;

		// Net salary
		netSalary = grossSalary - pf - monthlyTax;

		// Basic (for display)
		basicSalary = grossSalary - da;
	}

	// ✅ Separate methods for annual calculation

	double calculateAnnualFromLPA(double lpa) {
		return lpa * 100000;
	}

	double calculateAnnualFromMonthly(double monthly) {
		return monthly * 12;
	}

	void displayCategory() {
		if (netSalary > 50000)
			System.out.println("Category: High");
		else if (netSalary >= 25000)
			System.out.println("Category: Medium");
		else
			System.out.println("Category: Low");
	}

	void display() {
		System.out.println("\nEmployee Name : " + name);
		System.out.println("LPA           : " + lpa);
		System.out.println("Basic Salary  : " + basicSalary);
		System.out.println("Gross Salary  : " + grossSalary);
		System.out.println("Net Salary    : " + netSalary);
		System.out.println("Annual Salary : " + annual);
		System.out.println("Tax Amount    : " + tax);
	}
}