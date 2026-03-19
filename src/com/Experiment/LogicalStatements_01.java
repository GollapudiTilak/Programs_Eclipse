package com.Experiment;

// Logical Statements : 
// if Condition 
import java.util.*;

// WAP to print the given age is Eligible for Voting or Driving.. ? 
public class LogicalStatements_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		// Syntax 1:
		if (age > 18) {
			System.out.println("You are Eligible for Voting or Driving !!");
			System.out.println("Congratulations !!");
		}
		// Syntax 2 :
		if (age > 18) // Execute Single Statement.
			// if(age >18); it is taking as a statement, if we keep semi-colon.
			System.out.println("You are Eligible for Voting or Driving !!");
		System.out.println("Congratulations !!");
		sc.close();
	}
}