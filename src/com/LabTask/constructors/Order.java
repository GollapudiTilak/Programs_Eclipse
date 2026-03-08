package com.LabTask.constructors;

public class Order {

	int orderID;
	String customerName;
	String foodItem;
	int quantity;
	double price;

	Order() {
		this(0, "Guest", "Not selected", 1, 0);
	}

	Order(int orderID, String customerName) {
		this(orderID, customerName, "Not selected", 1, 0);
	}

	Order(int orderID, String customerName, String foodItem) {
		this(orderID, customerName, foodItem, 1, 0);
	}

	Order(int orderID, String customerName, String foodItem, int quantity, int price) {
		this.orderID = orderID;
		this.customerName = customerName;
		this.foodItem = foodItem;
		this.quantity = quantity;
		this.price = price;
	}

	public static void main(String[] args) {
		Order order = new Order();
		order.displayOrder();

		Order order1 = new Order(101, "Rahul");
		order1.displayOrder();

		Order order2 = new Order(102, "Anjali", "Pizza");
		order2.displayOrder();

		Order order3 = new Order(103, "Arjun", "Burger", 2, 150);
		order3.addExtraItem("Fries", 50);
		order3.displayOrder();
	}

	void displayOrder() {
		System.out.println("Order ID: " + orderID);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Food Item: " + foodItem);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price per item: " + price);
		System.out.println("Total Bill: " + calculateBill());
		System.out.println("---------------------------------");

	}

	double calculateBill() {
		return quantity * price;
	}

	void addExtraItem(String item, int price) {
		System.out.println("Extra Item Added: " + item);
		this.price += price;
	}

}