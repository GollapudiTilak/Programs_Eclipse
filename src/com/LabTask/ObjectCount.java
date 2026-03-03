package com.LabTask;

//WAJP to count the number of objects created without Instance block count

public class ObjectCount {

	static int object;

	ObjectCount() {
		object++;
	}

	public static void main(String[] args) {
		ObjectCount object1 = new ObjectCount();
		ObjectCount object2 = new ObjectCount();
		ObjectCount object3 = new ObjectCount();
		System.out.println(object);
	}
}
