package com.practise.ifpgrms;

//Check if a number is divisible by both 3 and 5
import java.util.*;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("The given number is Divisible by 3 and 5 ");
		}
		sc.close();
	}

}
