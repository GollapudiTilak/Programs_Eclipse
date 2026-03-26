package com.Experiment.logicalstatements;

//WAP to print Factors of Given Numbers using for loop and the given number is perfect or not..
//input : 6
// factors of 6 : 1 2 3 6 --> 1 + 2 + 3 = 6 
// input : 9
// factors of 9 :1 3 9 
// input : 24
// factors : 1 2 3 4 6 8 12 24
// input : 28
// factors : 1 2 4 7 14 28 --> 1 + 2 + 4 + 7 + 14 = 28
// Perfect number means : SUm of factors is equals to Given number.
import java.util.*;

public class TestLSDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println("The given Number is perfect");
		} else {
			System.out.println("The given Number is not perfect");
		}
		System.out.println(num);

		sc.close();
	}

}
