package com.Experiment.logicalstatements;

// WAP to print sum of all the numbers using for loop like print sum of first 10 numbers..
public class TestLSDemo4 {
	public static void main(String[] args) {
		int sum = 0;
		
//		int j=0;
//		for(;j<10;j++) {
//			
//		}
		
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.print(sum+" ");
	}
}
