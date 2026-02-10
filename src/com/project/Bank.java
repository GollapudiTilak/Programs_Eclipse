package com.project;

public class Bank {
	static int seq = 123450;
	String user_name;
	String phone_number;
	double Balance;
	{
		seq++;
	}

	public static void main(String[] args) {
		Bank account = new Bank();
		System.out.println("Swiss National Bank Account Holders List ");
		System.out.println();
		account.user_name = "Tilak";
		account.phone_number = "9381705449";
		account.Balance = 25000.00;
		System.out.println("Account Holder Name : " + account.user_name);
		System.out.println("Account Holder Phone Number : " + account.phone_number);
		System.out.println("Account Balance : " + account.Balance);
		System.out.println("Account Number : " + seq);

		System.out.println();
		Bank account1 = new Bank();
		account1.user_name = "Nava Bharath";
		account1.phone_number = "8184982349";
		account1.Balance = 30000.00;
		System.out.println("Account Holder Name : " + account1.user_name);
		System.out.println("Account Holder Phone Number : " + account1.phone_number);
		System.out.println("Account Balance : " + account1.Balance);
		System.out.println("Account Number : " + seq);

		System.out.println();
		Bank account2 = new Bank();
		account2.user_name = "Raj Kumar";
		account2.phone_number = "7702295035";
		account2.Balance = 20000.00;
		System.out.println("Account Holder Name : " + account2.user_name);
		System.out.println("Account Holder Phone Number : " + account2.phone_number);
		System.out.println("Account Balance : " + account2.Balance);
		System.out.println("Account Number : " + seq);

	}

}
