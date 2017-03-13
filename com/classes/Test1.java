package com.classes;

public class Test1 {

	public static void main(String[] args) {
		Account account  = new Account();
		CurrentAccount curr1 = new CurrentAccount();
		SavingAccount save1 = new SavingAccount();
		System.out.println(getInterestRate(account));
		System.out.println(getInterestRate(curr1));
		System.out.println(getInterestRate(save1));
	}

	private static String getInterestRate(Account curr1) {
		String ans="";
		//<WRITE YOUR CODE HERE> Editing
		return ans;
	}

}
class Account{}
class CurrentAccount extends Account{}
class SavingAccount extends Account{}
