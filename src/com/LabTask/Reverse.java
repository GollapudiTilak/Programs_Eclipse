package com.LabTask;

public class Reverse {

	public static void main(String[] args) {
		int[] number = {5, 6, 7, 8, 9};
		int[] rev = new int[number.length];

		int i = number.length - 1;

		for (int num : number) {
		    rev[i--] = num;
		}

		for (int num : rev) {
		    System.out.print(num + " ");
		}
	}

}
