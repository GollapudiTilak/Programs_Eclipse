package com.Experiment.constructors;

public class Bank {
	long acno;

	public Bank(long acno) {
		super();
		this.acno = acno;
	}

}

class Account extends Bank {
	String name;
	double balance;

	public Account(long acno, String name, double balance) {
		super(acno);
		this.name = name;
		this.balance = balance;

	}

	void details() {
		System.out.println("Account number :" + acno);
		System.out.println("Name of the Account Holder : " + name);
		System.out.println("Balance : " + balance);

	}

	public static void main(String[] args) {

		Account a = new Account(5255, "Tilak", 500000);
		a.details();

	}
}