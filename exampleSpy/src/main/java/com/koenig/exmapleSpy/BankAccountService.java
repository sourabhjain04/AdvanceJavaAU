package com.koenig.exmapleSpy;

public class BankAccountService {

	public double getBalance() {
		return 1000.0; //assume fixed initial balance
	}
	
	public boolean withdraw(double amount) {
		if (amount<=getBalance()) {
			
			System.out.println("Withdrawal Successful : $ "+ amount);
			return true;
		}
		System.out.println("Insufficient funds ");
		return false;
	}
	
	
}
