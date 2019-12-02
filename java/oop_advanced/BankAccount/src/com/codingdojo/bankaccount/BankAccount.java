package com.codingdojo.bankaccount;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingBalance;
	private static int numberofaccounts=0;
	private static Random random = new Random();
	private static double totalAmount =0;
	public BankAccount() {
		super();
		this.accountNumber = randomNumGen();
		this.checkingBalance = 0;
		this.savingBalance = 0;
		numberofaccounts++;
	}
	public BankAccount(double checking,double saving) {
		this.accountNumber = randomNumGen();
		
		this.savingBalance =saving;
		this.checkingBalance = checking;
		totalAmount += (saving +checking);
		numberofaccounts++;
	}
		
	private static String randomNumGen() {
		return Integer.toString(random.nextInt(1000000000)+1000000000);
	}
	public void deposit(double amount,String account) {
		if(account == "saving" || account == "s") {
			this.setSavingBalance(this.getSavingBalance() + amount);
//			this.savingBalance += amount;
			totalAmount += amount;
			System.out.println(amount + "was deposited into  saving account with total saving" + this.savingBalance);
		}
		else if(account =="checking" || account =="c") {
			this.savingBalance += amount;
			totalAmount += amount;
			System.out.println(amount + " was deposited into checking account " );
			
		}
		else {
			System.out.println("try to enter the correct account number");
		}
		
	}
	public void withdrawl(double amount,String account) {
		
		if(account == "saving" || account == "s") {
			if(amount>this.getSavingBalance()) {
				System.out.println("Insuffient fund");
			}
			else {
			this.setSavingBalance(this.getSavingBalance() - amount);
//			this.savingBalance += amount;
			totalAmount -= amount;
			System.out.println(amount + "was withdraw from   saving account with total saving" + this.savingBalance);
			}
		}
		else if(account =="checking" || account =="c") {
			if(amount>this.getCheckingBalance()) {
				System.out.println("Insuffient fund");
			}
			else {
			this.savingBalance -= amount;
			totalAmount -= amount;
			System.out.println(amount + " was withdraw  from checking account  with total " + this.getCheckingBalance());
			}
			
		}
		else {
			System.out.println("try to enter the correct account number");
		}
	}
	public void accountBalance() {
		System.out.println("Total balance is: " + (this.getCheckingBalance() + this.getSavingBalance()));
	}
	
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	public static int getNumberofaccounts() {
		return numberofaccounts;
	}
	public static void setNumberofaccounts(int numberofaccounts) {
		BankAccount.numberofaccounts = numberofaccounts;
	}
	
	
	
	
	

}
