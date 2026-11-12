package com.myfirstproject;

public class Bank {
	static String bankName;

	String branch;
	int accountNo;
	String holderName;
	int balance;

	void info() {
		System.out.println("Bank Name   :" + bankName);
		System.out.println("branch      :" + branch);
		System.out.println("accountNo   :" + accountNo);
		System.out.println("holderName  :" + holderName);
		System.out.println("balance     :" + balance);

	}

	public static void main(String[] args) {
		System.out.println("bank details ");
		bankName = "State Bank Of India";

		Bank customer1 = new Bank();

		customer1.branch = "kphb";
		customer1.accountNo = 1234;
		customer1.holderName = "mani";
		customer1.balance = 10000;
		System.out.println("----------------------------");
		customer1.info();

		Bank customer2 = new Bank();

		customer2.branch = "kukatpally";
		customer2.accountNo = 1235;
		customer2.holderName = "naga";
		customer2.balance = 100;
		System.out.println("----------------------------");
		customer2.info();

		Bank customer3 = new Bank();

		customer3.branch = "madhapur";
		customer3.accountNo = 1236;
		customer3.holderName = "Raju";
		customer3.balance = 2;
		System.out.println("----------------------------");
		customer3.info();

	}

}