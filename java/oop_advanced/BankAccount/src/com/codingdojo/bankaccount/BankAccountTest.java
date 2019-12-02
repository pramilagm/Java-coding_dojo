package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String [] args) {
	BankAccount  account1 = new BankAccount();
	BankAccount account2 = new BankAccount(500.0,500.00);
	BankAccount account3 = new BankAccount(1000.00,2000.00);
	System.out.println(BankAccount.getNumberofaccounts());
	account2.accountBalance();
	account2.deposit(1000, "saving");
	account2.withdrawl(1400,"saving");
	account2.accountBalance();
	}
//	
	

}
