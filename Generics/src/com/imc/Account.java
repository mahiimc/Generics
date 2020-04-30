package com.imc;

public class Account {

	private int accId;
	private double balance;
	private int cutoId;
	public Account(int accId, double balance, int cutoId) {
		this.accId = accId;
		this.balance = balance;
		this.cutoId = cutoId;
	}
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getCutoId() {
		return cutoId;
	}
	public void setCutoId(int cutoId) {
		this.cutoId = cutoId;
	}
	
	public void deposit(double amount) {
		balance +=amount;
		
	}
	public void wihDraw(double amount) {
		balance-=amount;
		
	}
}
