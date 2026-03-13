package com.javaclasscodes.methods;

import java.util.Scanner;

//with argument + with return type
//WAP to find areas of Triangle, Rectangle, Square, Circle.
//
// Area of Triangle = 0.5 * base * height
// Area of Rectangle = length * breadth 
// Area of Square = side * side 
// Area of Circle = PI * r * r
public class TestMethodsDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

//		Area of Triangle = 0.5 * base * height
		System.out.println("Enter Base : ");
		double base = sc.nextDouble();

		System.out.println("Enter height : ");
		float height = sc.nextFloat();

		double arTri = findAreaOfTriangle(base, height);
		System.out.println("Area Of Traingle is : " + arTri);

//		Area of Circle = PI * r * r 
		System.out.println("Enter radius : ");
		double radius = sc.nextDouble();
		double arCir = findAreaOfCircle(radius);
		System.out.println("Area of Circle is : " + arCir);

	}

	static double findAreaOfCircle(double r) {
		double arCir = Math.PI * r * r;
		return arCir;
	}

	static double findAreaOfTriangle(double b, double h) {
		double arTri = 0.5 * b * h;
		return arTri;
	}

}