package com.project;

public class Count {
	static int a;
	{
		a++;
	}

	public static void main(String[] args) {
		Count b = new Count();
		Count c = new Count();
		Count d = new Count();
		Count e = new Count();
		System.out.println(a);
	}

}
