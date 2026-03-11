package com.Experiment;

class Vehicle1 {
	String brand;

	public Vehicle1(String brand) {
		this.brand = brand;
	}

	void details() {
		System.out.println("Brand of the Vehicle : " + brand);
	}
}

class Car2 extends Vehicle1 {
	String model;
	double price;

	public Car2(String brand, String model, double price) {
		super(brand);
		this.model = model;
		this.price = price;
	}

	void details(Vehicle1 c) {
		System.out.println("Model of the Vehicle : " + model);
		System.out.println("Price of the Vehicle : " + price + " Cr");
	}

}

public class Vehicle {

	public static void main(String[] args) {
		Car2 c = new Car2("Rangerover", "Autobiography", 2.93);
		c.details();
		c.details((Vehicle1) c);
	}

}
