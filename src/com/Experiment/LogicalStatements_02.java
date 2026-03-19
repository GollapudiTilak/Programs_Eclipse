package com.Experiment;

// Logical Statements : 
// if-else Condition 
import java.util.*;

// WAP to print the given age is Eligible for Voting or Driving.. ? 
public class LogicalStatements_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// Ctrl + Shift + O to "import java.util.Scanner" package.
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		// Syntax :
		if (age > 18) {
			System.out.println("You are Eligible for Voting & Driving !!");
			System.out.println("Congratulations !!");
		} else {
			System.out.println("You are not Eligible for Voting & Driving");
		}

		System.out.println("Are you Attending classes Regularly : ");
		boolean areYouAttedingClassRegualarly = sc.nextBoolean();
		boolean areYouAttedingWeeklyTest = sc.nextBoolean();
		if (areYouAttedingClassRegualarly && areYouAttedingWeeklyTest) { // Using Logical &, I need the both should be
																			// true.
			System.out.println("You will understand the classes properly & you will get a JOb in 2026 !!");
		} else {
			System.out.println(
					"You are a Rich kid !! you no need yo learn anything, Just you can depend on your parents & friends !!");
		}
		sc.close();
	}
}