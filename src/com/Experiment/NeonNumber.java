package com.Experiment;

import java.util.*;

public class NeonNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();

		int square = number * number;

		System.out.println("" + square);
		int sum = 0;
		int digit = 0;

		while (square != 0) { 
			digit = square % 10; 
			sum += digit; 
			square /= 10;
		}
		System.out.println(sum);
		if (sum == number) { 
			System.out.println(number + " is a Neon Number");
		} else {
			System.out.println(number + " is not a Neon Number");
		}
		sc.close();

	}

}
