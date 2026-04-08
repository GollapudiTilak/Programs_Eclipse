package com.console;

import java.util.*;

// Console-Based Personal Finance Manager (PFM)
public class PFM {

	static double[] income = new double[100];
	static String[] incomeSource = new String[100];

	static double[] expense = new double[100];
	static String[] expenseCategory = new String[100];

	static int incomeCount = 0;
	static int expenseCount = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n===== PERSONAL FINANCE MANAGER =====");
			System.out.println("1. Add Income");
			System.out.println("2. Add Expense");
			System.out.println("3. View Summary");
			System.out.println("4. View All Transactions");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1 -> addIncome(sc);

			case 2 -> addExpense(sc);

			case 3 -> showSummary();

			case 4 -> showAllTransactions();

			case 5 -> {
				System.out.println("Thank you! Exiting...");
				return;
			}

			default -> System.out.println("Invalid choice! Try again.");
			}
		}
	}

	public static void addIncome(Scanner sc) {

		sc.nextLine();

		System.out.print("Enter income source (Salary/Business/etc): ");
		String source = sc.nextLine();

		System.out.print("Enter income amount: ");
		double amount = sc.nextDouble();

		income[incomeCount] = amount;
		incomeSource[incomeCount] = source;
		incomeCount++;

		System.out.println("Income added successfully!");
	}

	public static void addExpense(Scanner sc) {

		sc.nextLine();

		System.out.print("Enter expense category (Food/Travel/etc): ");
		String category = sc.nextLine();

		System.out.print("Enter expense amount: ");
		double amount = sc.nextDouble();

		expense[expenseCount] = amount;
		expenseCategory[expenseCount] = category;
		expenseCount++;

		System.out.println("Expense added successfully!");
	}

	public static double getTotalIncome() {
		double total = 0;
		for (int i = 0; i < incomeCount; i++) {
			total += income[i];
		}
		return total;
	}

	public static double getTotalExpense() {
		double total = 0;
		for (int i = 0; i < expenseCount; i++) {
			total += expense[i];
		}
		return total;
	}

	public static void showSummary() {

		double totalIncome = getTotalIncome();
		double totalExpense = getTotalExpense();
		double savings = totalIncome - totalExpense;

		System.out.println("\n===== FINANCIAL SUMMARY =====");
		System.out.println("Total Income  : ₹" + totalIncome);
		System.out.println("Total Expense : ₹" + totalExpense);
		System.out.println("Savings       : ₹" + savings);
	}

	public static void showAllTransactions() {

		System.out.println("\n--- Income Details ---");
		for (int i = 0; i < incomeCount; i++) {
			System.out.println(incomeSource[i] + " : ₹" + income[i]);
		}

		System.out.println("\n--- Expense Details ---");
		for (int i = 0; i < expenseCount; i++) {
			System.out.println(expenseCategory[i] + " : ₹" + expense[i]);
		}
	}
}