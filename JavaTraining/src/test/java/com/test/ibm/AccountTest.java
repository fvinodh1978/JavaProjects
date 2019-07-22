package com.test.ibm;

import java.util.Scanner;

import com.ibm.java.Account;

public class AccountTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accountType1, accountType2;
		Double accountBalance1_1, accountBalance1_2, accountBalance2_1, accountBalance2_2;
		Scanner sc = new Scanner(System.in);
		accountType1=sc.next();
		accountBalance1_1=sc.nextDouble();
		accountBalance1_2=sc.nextDouble();
		Account savingsAc = new Account(1, 12001, accountType1, accountBalance1_1);
		accountType2=sc.next();
		accountBalance2_1=sc.nextDouble();
		accountBalance2_2=sc.nextDouble();
		savingsAc.getAccountDetails();
		savingsAc.depositAmount(accountBalance1_2);
		Account currentAc = new Account(1, 12001, accountType2, accountBalance2_1);
		currentAc.getAccountDetails();
		currentAc.depositAmount(accountBalance2_2);
	}
}
