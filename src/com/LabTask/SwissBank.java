package com.LabTask;

import java.util.Scanner;

public class SwissBank {

	long ACNo;
	String Name;
	double Balance;
	int pin;

	void deposit(double amount) {
		Balance = Balance + amount;
		System.out.println("Amount Deposited: " + amount);
		System.out.println("Total Balance After Deposit: " + Balance);
	}

	void withdraw(double amount) {
		Balance = Balance - amount;
		System.out.println("Amount Withdrawn: " + amount);
	}

	void checkBalance() {
		System.out.println("Current Balance: " + Balance);
	}

	void pinChange(int newPin) {
		pin = newPin;
		System.out.println("PIN Changed Successfully");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SwissBank b = new SwissBank();

		System.out.println("Welcome To Swiss National Bank");
		System.out.print("Enter Account Number: ");
		b.ACNo = sc.nextLong();

		sc.nextLine();

		System.out.print("Enter Name: ");
		b.Name = sc.nextLine();

		System.out.print("Enter PIN: ");
		b.pin = sc.nextInt();

		System.out.print("Enter Initial Balance: ");
		b.Balance = sc.nextDouble();

		System.out.print("Enter Amount to Deposit: ");
		double dep = sc.nextDouble();
		b.deposit(dep);

		System.out.print("Enter Amount to Withdraw: ");
		double wd = sc.nextDouble();
		b.withdraw(wd);

		b.checkBalance();

		System.out.print("Enter New PIN: ");
		int newPin = sc.nextInt();
		b.pinChange(newPin);

		sc.close();
	}
}