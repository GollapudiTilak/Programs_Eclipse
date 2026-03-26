package com.Experiment.logicalstatements;

import java.util.Scanner;

// Factorial program using methods
public class TestLSDemo3 {
	static void findFactors(int num) {
		for (int i = 1; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();

		findFactors(num);
		sc.close();
	}

}
