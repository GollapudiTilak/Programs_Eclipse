package com.Experiment;

import java.util.*;

//Ternary Operators -->
// Syntax : 
// Condition ? value_if_true : value_if_false
public class Operators_08 {

	public static void main(String[] args) {

		int x = 30;
		int y = 20;
		int z = 5;

		int max1 = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(max1);

		int a = 10;
		int b = 20;

		int max = (a > b) ? a : b;
		System.out.println("Max Value is :" + max);

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
//		boolean isEligible = (age > 18) ? true : false;
		String isEligible = (age > 18) ? "Yes" : "No";
		System.out.println("The Entered age is Eligible : " + isEligible);
		sc.close();
	}

}
