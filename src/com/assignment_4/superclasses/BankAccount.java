package com.assignment_4.superclasses;
import java.util.UUID;
import com.assignment_4.interfaces.*;

public class BankAccount implements BankOperations{ 
		private String accountNumber = "";
		private String accountType = "Bank account";
		private double balance = 0.0;
		
		
		public BankAccount() { 
			this.accountNumber = UUID.randomUUID().toString().substring(0,6); 
			this.balance = 0;
			this.accountType = "Bank account";   
		}
		
	public String getAccountNumber() { 
			return accountNumber; 
	}
	
	public void setAccountNumber (String accountNumber) { 
			this.accountNumber = accountNumber; 
	}
	
	public double getBalance() {
			return balance;
	}
	public void setBalance(double balance) {
			this.balance = balance;
	}
	public String getAccountType() {
			return accountType;
	}
	public void setAccountType (String accountType) {
			this.accountType = accountType;
	}
	
	@Override
	public String toString() {
			return "BankAccount [accountNumber =" + getAccountNumber() + ", balance=" + getBalance() +",accountType=" + getAccountType() + "]"; 
		}

	
	

	@Override
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		}else {
			System.out.println ("You can not withdraw a negative value!") ;
		}
		
	}

	@Override
	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount) ;
		}else {
			System.out.println("You can not desposit a negative value!");
			
		}
	} 
	
	}
