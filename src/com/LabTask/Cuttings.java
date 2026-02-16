package com.LabTask;

public class Cuttings {

	String employee_name;
	Double tax;
	Double monthly_salary;
	Double pf;
	Double da;
	Double taxAmount;
	Double finalMonthlySalary;
	Double annualSalary;
	Double Cuttings;

	public static void main(String[] args) {
		Cuttings emp = new Cuttings();
	}

	{
		employee_name = "Nava Bharath Kumar";
		monthly_salary = 150000.0;
		tax = 18.0;

		da = monthly_salary * 3 / 100;
		pf = monthly_salary * 8 / 100;
		taxAmount = (monthly_salary + da) * tax / 100;
		finalMonthlySalary = monthly_salary + da - pf - taxAmount;
		annualSalary = finalMonthlySalary * 12;
		monthly_salary = monthly_salary * 12;
		Cuttings = monthly_salary - annualSalary;
		System.out.println("Employee Salary Details");
		System.out.println();
		System.out.println("Employee Name: " + employee_name);
		System.out.println("Monthly Salary: " + monthly_salary);
		System.out.println("DA Amount : " + da);
		System.out.println("PF Amount : " + pf);
		System.out.println("Tax Amount : " + taxAmount);
		System.out.println("Final Monthly Salary : " + finalMonthlySalary);
		System.out.println("Actual Annual Salary : " + monthly_salary);
		System.out.println("Annual Salary After Tax: " + annualSalary);
		System.out.println("Tax Amount per Annual :" + Cuttings);
	}
}