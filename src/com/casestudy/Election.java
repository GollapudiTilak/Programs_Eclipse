package com.casestudy;

import java.util.*;

public class Election {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age;
		int eligibleCount = 0;
		int nonEligibleCount = 0;

		System.out.print("Enter age of person 1: ");
		age = sc.nextInt();

		int oldest = age;
		int youngest = age;

		if (age >= 18) {
			eligibleCount++;
		} else {
			nonEligibleCount++;
		}

		for (int i = 2; i <= 10; i++) {
			System.out.print("Enter age of person " + i + ": ");
			age = sc.nextInt();

			if (age >= 18) {
				eligibleCount++;
			} else {
				nonEligibleCount++;
			}

			if (age > oldest) {
				oldest = age;
			}

			if (age < youngest) {
				youngest = age;
			}
		}

		System.out.println("\nResults:");
		System.out.println("Eligible voters: " + eligibleCount);
		System.out.println("Non-eligible voters: " + nonEligibleCount);
		System.out.println("Oldest voter age: " + oldest);
		System.out.println("Youngest voter age: " + youngest);

		sc.close();
	}

}
