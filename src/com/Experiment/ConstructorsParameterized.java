package com.Experiment;

public class ConstructorsParameterized {

	String sid;
	String sname;
	int sage;

	ConstructorsParameterized() {
		System.out.println("Student no-arg constructor called ");
	}

	// Parameterized constructors
	ConstructorsParameterized(String sid, String sname, int sage) {
		System.out.println("Parameterized constructor called ");
//		this.sage = sage;
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);

	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		ConstructorsParameterized s1 = new ConstructorsParameterized("JFS-VC-001", "Siddu", 21);
//		s1.show();

		ConstructorsParameterized s2 = new ConstructorsParameterized("JFS-VC-002", "Tilak", 22);
//		s2.show();

		System.out.println("main method ended !");

	}

//	void show() {
//		System.out.println(sid);
//		System.out.println(sname);
//		System.out.println(sage);
//	}

}
