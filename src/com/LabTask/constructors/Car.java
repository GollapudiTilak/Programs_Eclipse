package com.LabTask.constructors;

public class Car {
	String brand;
	String model;
	double mileage;
	String color;
	String enginee;
	String price;
	int year;

	Car() {
		this("Rolls Royce");
	}

	Car(String brand) {
		this(brand, "Boat Tail");
	}

	Car(String brand, String model) {
		this(brand, model, 6.1);
	}

	Car(String brand, String model, double mileage) {
		this(brand, model, mileage, "pearl-inspired oyster and soft rose blend");
	}

	Car(String brand, String model, double mileage, String color) {
		this(brand, model, mileage, color, "6.75-liter twin-turbocharged V12 engine");
	}

	Car(String brand, String model, double mileage, String color, String enginee) {
		this(brand, model, mileage, color, enginee, "235 Crore");
	}

	Car(String brand, String model, double mileage, String color, String enginee, String price) {
		this(brand, model, mileage, color, enginee, price, 2021);
	}

	Car(String brand, String model, double mileage, String color, String enginee, String price, int year) {
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
		this.color = color;
		this.enginee = enginee;
		this.price = price;
		this.year = year;
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.details();
	}

	void details() {
		System.out.println("Brand             : " + brand);
		System.out.println("Model             : " + model);
		System.out.println("Milege            : " + mileage);
		System.out.println("Color             :" + color);
		System.out.println("Enginee           : " + enginee);
		System.out.println("Price             : " + price);
		System.out.println("Manufactured Year : " + year);
	}

}
