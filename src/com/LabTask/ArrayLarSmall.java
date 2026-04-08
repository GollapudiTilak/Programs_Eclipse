package com.LabTask;

import java.util.*;

public class ArrayLarSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		
		System.out.println("Enter Array Numbers : ");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		int max = numbers[0];
		int min = numbers[0];

		for (int num : numbers) {
			if (num < min) {
				min = num;
			} else if (num > max) {
				max = num;
			}
		}
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);

		sc.close();
	}

}
