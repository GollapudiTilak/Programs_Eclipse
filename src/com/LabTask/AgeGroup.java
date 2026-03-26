package com.LabTask;

import java.util.*;

public class AgeGroup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age > 0 && age <= 5) {
			System.out.println("Child");
		} else if (age >= 6 && age <= 12) {
			System.out.println("Kid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Teen");
		} else if (age >= 20 && age <= 35) {
			System.out.println("Young");
		} else if (age >= 36 && age <= 59) {
			System.out.println("Middle");
		} else if (age >= 60) {
			System.out.println("Old");
		} else {
			System.out.println("Nuv inka putaledhu rah babu..");
		}
		sc.close();
	}

}
