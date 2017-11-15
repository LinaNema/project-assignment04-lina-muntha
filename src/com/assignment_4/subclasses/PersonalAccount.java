package com.assignment_4.subclasses;

import java.util.UUID;
import com.assignment_4.superclasses.BankAccount; 

public class PersonalAccount extends BankAccount {
	public PersonalAccount() { 
		
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");

	}

}
