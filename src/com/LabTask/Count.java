package com.LabTask;

public class Count {

	public static void main(String[] args) {

		int amount = 6657;

		System.out.println("Total Amount: " + amount);

		int thousand = amount / 1000;
		amount = amount % 1000;
		System.out.println("1000 notes: " + thousand);
		System.out.println("Remaining after 1000 notes: " + amount);

		int hundred = amount / 100;
		amount = amount % 100;
		System.out.println("100 notes: " + hundred);
		System.out.println("Remaining after 100 notes: " + amount);

		int ten = amount / 10;
		amount = amount % 10;
		System.out.println("10 notes: " + ten);
		System.out.println("Remaining after 10 notes: " + amount);

		int one = amount;
		System.out.println("1 notes: " + one);
		System.out.println("Final Remaining Amount: " + 0);
	}
}