package com.Experiment;

import java.util.*;

public class NeonNumber {

	public static void main(String[] args) {
		// Scanner is used to create an Object and System.in is used to take the input
		// from the User.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		// Reads an integer value entered by the user and stored in the
		// variable(number).
		int number = sc.nextInt();

		int square = number * number;

		System.out.println("" + square);
		int sum = 0;
		int digit = 0;

		while (square != 0) { // The loop runs until square becomes 0.
			digit = square % 10; // gets the last digit.
		//	System.out.println("Digit: " + digit);

			sum += digit; //// square % 10 gets the last digit.
			square /= 10;// Removes the last digit.
		}
		System.out.println(sum);
		if (sum == number) { // Checks if the sum of digits equals the original number.
			System.out.println(number + " is a Neon Number");
		} else {
			System.out.println(number + " is not a Neon Number");
		}
		sc.close();

	}

}
