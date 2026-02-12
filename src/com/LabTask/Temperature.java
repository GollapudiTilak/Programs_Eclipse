package com.LabTask;

public class Temperature {
	//double Celsius;
	//double Fahrenheit;
	

	public static void main(String[] args) {
		//Temperature temp = new Temperature();
		var Celsius = 33.0;
		var Fahrenheit = (Celsius * 9 / 5) + 32;
		var Cel = (Fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius to Fahrenheit : " + Fahrenheit);
		System.out.println("Fahrenheit to Celsius : " + Cel);
	}

}
