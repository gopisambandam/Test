package com.tavigo;

public class Account {
	Integer accountNumber;
	Float balance;
	Customer customerId;
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", customerId=" + customerId + "]";
	}
	public Account(Integer accountNumber, Float balance, Customer customerId) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerId = customerId;
	}
	

}
