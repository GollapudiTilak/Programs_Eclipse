package com.LabTask.constructors;

class Vehicle {
	String brand;

	public Vehicle(String brand) {
		this.brand = brand;
	}
}

class Car1 extends Vehicle {
	String name;
	String model;
	double price;

	public Car1(String brand, String name, String model, double price) {
		super(brand);
		this.name = name;
		this.model = model;
		this.price = price;
	}
}

class Electrical extends Car1 {
	double batteryCapacity;

	public Electrical(String brand, String name, String model, double price, double batteryCapacity) {
		super(brand, name, model, price);
		this.batteryCapacity = batteryCapacity;
	}

	void details() {
		System.out.println("Brand of the Vehicle  : " + brand);
		System.out.println("Name of the Vehicle   : " + name);
		System.out.println("Model of the Vehicle  : " + model);
		System.out.println("Price of the Vehicle  : " + price + " Lakh");
		System.out.println("Battery Capacity      : " + batteryCapacity + " kWh");
	}
}

public class ConstructorChainingVehicle {
	public static void main(String[] args) {
		Electrical e = new Electrical("BYD", "Build Your Dreams", "Seal", 53.15, 82.56);
		e.details();

	}
}