package com.LabTask;

public class Employee {
	int eid;
	String ename;
	double esal;
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.Employee_1();
	}

	void Employee_1() {

		ename = "Tilak";
		esal = 125000;
		eid= 24332;
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee ID  :" + eid);
		System.out.println("Employee Salary : " + esal);

		double bonus = esal * 0.20;
		esal = esal + bonus;
		System.out.println("Increase of Salary : "+bonus);
		System.out.println("Salary after Bonus : " + esal);

		System.out.println();
		ename = "Nava Bharath";
		esal = 150000;
		eid= 24333;
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee ID  :" + eid);
		System.out.println("Employee Salary : " + esal);

		double bonus1 = esal * 0.20;
		esal = esal + bonus1;
		System.out.println("Increase of Salary : "+bonus1);
		System.out.println("Salary after Bonus : " + esal);

		System.out.println();
		ename = "Raj Kumar";
		eid= 24334;
		esal = 200000;
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee ID  :" + eid);
		System.out.println("Employee Salary : " + esal);

		double bonus2 = esal * 0.20;
		esal = esal + bonus2;
		System.out.println("Increase of Salary : "+bonus2);
		System.out.println("Salary after Bonus : " + esal);

	}

}
