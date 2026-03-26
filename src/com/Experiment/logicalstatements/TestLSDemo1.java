package com.Experiment.logicalstatements;

// for loop
// WAP to print Even & Odd numbers using for loop..

import java.util.*;

public class TestLSDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Even numbers :");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(i + " ");
			} 
		}
		
		System.out.println("\nOdd numbers :");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1 && i != 0) {
				System.out.print(i + " ");
			} 
		}
		sc.close();
	}

}