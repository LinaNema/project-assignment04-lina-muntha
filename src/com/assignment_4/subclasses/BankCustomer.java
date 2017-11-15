package com.assignment_4.subclasses;
import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount; 
import com.assignment_4.superclasses.Human;

public class BankCustomer extends Human {
	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount> ();

	public BankCustomer(String name,int age) {
		super(name, age);
	}
	
	 public ArrayList<BankAccount>  getCustomerAccounts () {
	return customerAccounts; 
	
}
    public void  setCustomerAccounts (ArrayList<BankAccount> customerAccounts) {
	this.customerAccounts = customerAccounts; 
}

	public void addAccount (BankAccount bankAccount) {
	customerAccounts.add(bankAccount);
}
	public void depositToAccount (String accountNumber, double amount) {
	for (int i = 0;i < customerAccounts.size();i++) {
		if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)){ //
			customerAccounts.get(i).depositMoney(amount);
			
				}
			
		}
	
}
public void withdrawFromAccount (String accountNumber, double amount) {
	for (int i = 0;i < customerAccounts.size();i++) {
		if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
			customerAccounts.get(i).withdrawMoney(amount);
			
				}
		}
}
public String toString() {
	String a = "";
	for (int i=0;i<customerAccounts.size();i++) {
		a = a + (customerAccounts.get(i). toString() +  "\n");
		}
	return "Customer: " + getName()+ " " + "Age: " + getAge() + "\n" + a;

		}

}

