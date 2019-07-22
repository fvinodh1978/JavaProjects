/**
 * 
 */
package com.ibm.java;

/**
 * @author VINODHFRANCIS
 *
 */
public class Account {
	int accountNo;
	double accountBalance;
	String accountType;
	static int accountCount;
	/**
	 * Constructor for class Account
	 */
	public Account(int accoutCount, int accountNo, String accountType, double balance) {
		// TODO Auto-generated constructor stub
		this.accountCount=this.accountCount+1;
		this.accountBalance=balance;
		this.accountNo=accountNo;
		this.accountType=accountType;
	}
	
	/**
	 * 
	 * depositAmount : To add amount into account balance 
	 */
	public void depositAmount(double amount) {
		this.accountBalance=this.accountBalance + amount;
		System.out.println("\nBalance After Deposit: " + this.accountBalance + "\n");
	}
	
	/**
	 * getAccountDetails : To display account details
	 */
	public void getAccountDetails() {
		System.out.println("Acct No: " + accountCount );
		System.out.println("Acct Type: " + this.accountType );
		System.out.println("Acct Balance: " + this.accountBalance );
	}
}
