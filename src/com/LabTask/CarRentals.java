package com.LabTask;

import java.util.*;

public class CarRentals {

	public static void main(String[] args) {

		CarRentals car = new CarRentals();
		car.hello();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of days : ");
		int days = sc.nextInt();
		double total = car.amount(days) + car.policy();
		System.out.println("Total number of days : " + days);
		System.out.println("Total Amount for the days :" + car.amount(days));
		System.out.println("Insurance Amount :" + car.policy());
		System.out.println("Total amount with insurance : " + total);
		sc.close();
	}

	void hello() {
		System.out.println("Welcome to Zoom Car Rentals");
	}

	int policy() {
		int insurance = 500;
		return insurance;
	}

	double amountperday() {
		double amountperday = 1500;
		return amountperday;
	}

	double amount(double days) {
		double amount = amountperday() * days;
		return amount;
	}

}
