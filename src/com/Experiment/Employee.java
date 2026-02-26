package com.Experiment;

//Create a program to:
//Enter Employee ID
//Employee Name
//Gender (char)
//Department
//Basic Salary
//Methods should:
//Return employee name
//Calculate yearly salary
//Calculate bonus (10% of salary)
//Return full employee details


import java.util.*;

public class Employee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter Employee ID: ");
        // nextShort() : Scans the next token of the input as a short.
        short employee = sc.nextShort();
        // nextLine() : Advances this scanner past the current line and returns the input that was skipped.
        sc.nextLine();   

        System.out.print("Enter Employee Name: ");
        String employee_name = sc.nextLine();

        System.out.print("Enter Gender (M/F): ");
        //next() : Finds and returns the next complete token from this scanner.
        //charAt(int index) : Returns the character at the specified index in a string.
        char gender = sc.next().charAt(0);
        sc.nextLine();   

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        //nextDouble() : Scans the next token of the input as a double.
        double salary = sc.nextDouble();

        String name = e.getEmployeeName(employee_name);
        double yearlySalary = e.calculateYearlySalary(salary);
        double bonus = e.calculateBonus(yearlySalary);

        System.out.println("\n------- Employee Details -------");
        System.out.println("Employee ID : " + employee);
        System.out.println("Employee Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Department : " + department);
        System.out.println("Basic Salary : " + salary);
        System.out.println("Yearly Salary : " + yearlySalary);
        System.out.println("Bonus (10%) : " + bonus);

        sc.close();
    }

    String getEmployeeName(String name) {
        return name;
    }

    double calculateYearlySalary(double salary) {
        return salary * 12;
    }

    double calculateBonus(double yearlySalary) {
        return yearlySalary * 0.10;
    }
}