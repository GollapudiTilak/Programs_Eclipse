package com.LabTask;

import java.util.*;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int r = temp % 10;
			int fact = 1;
			for (int i = 1; i <= r; i++) {
				fact = fact * i;
			}
			sum += fact;
			temp = temp / 10;
		}

		if (sum == num) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not a Strong Numbers");
		}
		sc.close();
	}

}
