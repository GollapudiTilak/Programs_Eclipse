package com.project;

public class Investment {
	static int Total = 100;
	static int pen_cost = 7;

	public static void main(String[] args) {
		System.out.println("Number of Pens : " + (Total / pen_cost));
		System.out.println("Remaining Amount : " + (Total % pen_cost));
	}

}
