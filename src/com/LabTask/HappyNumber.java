package com.LabTask;

import java.util.*;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;

		while (temp != 1 && temp != 4) {
			int sum = 0;

			while (temp > 0) {
				int digit = temp % 10;
				sum += digit * digit;
				temp /= 10;
			}

			temp = sum;
		}

		if (temp == 1) {
			System.out.println(num + " is a Happy Number");
		} else {
			System.out.println(num + " is Not a Happy Number");
		}

		sc.close();
	}

}
