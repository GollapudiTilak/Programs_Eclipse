package com.practise.ifpgrms;

//Check if a number is a perfect square
import java.util.*;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
//		int sqrt = Math.sqrt(num); // Type mismatch: cannot convert from double to int
		int sqrt = (int) Math.sqrt(num);
		
		if (sqrt *sqrt ==num) {
			System.out.println("Given number a perfect square");
		}
		sc.close();
	}

}
