package com.LabTask;

import java.util.Scanner;

class OnlineFoodOrderSystem {

	double calculateItemTotal(double price, int quantity) {
		return price * quantity;
	}

	double calculateGST(double amount) {
		return amount * 0.05;
	}

	double addDeliveryCharge(double amount) {
		return amount + 40;
	}

	void printBill(int quantity, double itemTotal, double gst, double priceAfterGST, double finalAmount) {

		System.out.println("----- BILL -----");
		System.out.println("Quantity: " + quantity);
		System.out.println("Price without GST: " + itemTotal);
		System.out.println("GST (5%): " + gst);
		System.out.println("Price after GST: " + priceAfterGST);
		System.out.println("Delivery Charge: 40");
		System.out.println("Final Bill Amount: " + finalAmount);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		OnlineFoodOrderSystem order = new OnlineFoodOrderSystem();

		double price = 250;

		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();

		double itemTotal = order.calculateItemTotal(price, quantity);

		double gst = order.calculateGST(itemTotal);

		double priceAfterGST = itemTotal + gst;

		double finalAmount = order.addDeliveryCharge(priceAfterGST);

		order.printBill(quantity, itemTotal, gst, priceAfterGST, finalAmount);

		sc.close();
	}
}