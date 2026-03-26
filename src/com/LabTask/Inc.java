package com.LabTask;

public class Inc {

	public static void main(String[] args) {
		int x = 3;
		int y = x << 2 + 1;

		int a = 8;
		int b = 2;
		int c = a >> b << 1;

		int x1 = 5;
		int y1 = (x1 > 3) ? x1++ : ++x1;
		System.out.println(y);
		System.out.println(c);
		System.out.println(1<<2<<3);
		System.out.println(x1+" "+y1);
	}

}
