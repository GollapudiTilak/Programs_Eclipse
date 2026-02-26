package com.LabTask;

import java.util.*;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Radius of Circle");
		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();

		Area a = new Area();
		System.out.printf("Area of Circle is : %.2f%n", a.getRadius(r));

		System.out.println();
		System.out.println("Area of Triangle");
		System.out.println("Enter Base of Triangle :");
		double b = sc.nextDouble();

		System.out.println("Enter Hight of Triangle : ");
		double h = sc.nextDouble();
		System.out.println("Area of the Triangle is : " + a.AreaOfTriangle(b, h));

		System.out.println();
		System.out.println("Area Of Rectangle");
		System.out.println("Enter Length of Rectangle : ");
		double l = sc.nextDouble();
		System.out.println("Enter Hight of Rectangle :");
		double h1 = sc.nextDouble();
		System.out.println("Area of Rectangle is : " + a.getRectangle(l, h1));

		System.out.println();
		System.out.println("Area of Square");
		System.out.println("Enter side :");
		int s = sc.nextInt();
		System.out.println("Area of Square is : " + a.getSquare(s));
		sc.close();
	}

	double getRadius(double r) {
		return Math.PI * r * r;
	}

	double AreaOfTriangle(double b, double h) {
		double area = 0.5 * b * h;
		return area;
	}

	double getRectangle(double l, double h1) {
		double area1 = l * h1;
		return area1;
	}

	int getSquare(int s) {
		return s * s;
	}
}
