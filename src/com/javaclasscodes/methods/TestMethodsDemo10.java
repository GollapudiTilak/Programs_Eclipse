package com.javaclasscodes.methods;

class Employee {
	String name = "Srikanth";
}

public class TestMethodsDemo10 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		getEmployee(e1);
	}

	static void getEmployee(Employee e1) {
		System.out.println(e1.name);
	}
}


/*
 * Ahhh 🔥 classic confusion topic — call by reference vs call by value in Java.
 * 
 * Short answer first:
 * 
 * 👉 No. This is NOT call by reference. 👉 Java is ALWAYS call by value.
 * 
 * Now let’s understand properly.
 * 
 * 📌 Your Code Employee e1 = new Employee(); getEmployee(e1);
 * 
 * You are passing e1 to the method.
 * 
 * Now the big question:
 * 
 * Are we passing the object? Or are we passing reference? Or something else?
 * 
 * 🧠 What Actually Happens
 * 
 * When you write:
 * 
 * Employee e1 = new Employee();
 * 
 * new Employee() → creates object in heap memory
 * 
 * e1 → stores reference (address) of that object
 * 
 * Now when you call:
 * 
 * getEmployee(e1);
 * 
 * Java does this:
 * 
 * It copies the reference value
 * 
 * Sends that copy to method parameter
 * 
 * So inside method:
 * 
 * static void getEmployee(Employee e1)
 * 
 * This e1 is a copy of reference.
 * 
 * 💡 Important Line (Interview Ready)
 * 
 * Java is strictly pass-by-value. When we pass an object, we pass the value of
 * its reference, not the actual object.
 * 
 * 🏠 Real World Example
 * 
 * Imagine:
 * 
 * Object = House 🏠
 * 
 * Reference = Address of house 📍
 * 
 * You give your friend:
 * 
 * 📍 Address of house (not the house itself)
 * 
 * Your friend can:
 * 
 * Go to house
 * 
 * Paint it
 * 
 * Change furniture
 * 
 * But if friend writes:
 * 
 * e1 = new Employee();
 * 
 * He is just changing his copy of address.
 * 
 * Your original address does not change.
 * 
 * 🔥 Proof Example
 * 
 * Add this inside method:
 * 
 * static void getEmployee(Employee e1) { e1 = new Employee(); }
 * 
 * Will original object change?
 * 
 * ❌ NO.
 * 
 * Because you changed only the copied reference.
 * 
 * 🎯 Final Interview Answer
 * 
 * If interviewer asks:
 * 
 * Is Java call by reference?
 * 
 * You say confidently:
 * 
 * No. Java is always pass by value. For objects, the value of the reference is
 * passed, not the object itself.
 * 
 * 🏆 Simple Rule to Remember
 * 
 * Primitive → value copied
 * 
 * Object → reference value copied
 * 
 * But still → pass by value
 */