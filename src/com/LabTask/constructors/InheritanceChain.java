package com.LabTask.constructors;

class GrandParent {
	void show(GrandParent g) {
		System.out.println("Grand Parent class");
	}
}

class Parent extends GrandParent {
	void show(Parent p) {
		System.out.println("Parent class");
	}
}

class Child extends Parent {
	void show(Child c) {
		System.out.println("Child class");
	}
}

public class InheritanceChain {

	public static void main(String[] args) {

		Child c = new Child();

		c.show((GrandParent) c);
		c.show((Parent) c);
		c.show(c);

	}
}