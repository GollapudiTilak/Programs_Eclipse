package com.LabTask;

import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%3==0) {
				System.out.println("Fizz");
				break;
			}else if(n%5==0) {
				System.out.println("Buzz");
				break;
			}else if(n%3==0 && n%5==0) {
				System.out.println("FizzBuzz");
				break;
			}else {
				System.out.println(n);
				break;
			}
		}
		
		sc.close();
	}

}
