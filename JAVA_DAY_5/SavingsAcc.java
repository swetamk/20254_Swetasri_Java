package com.sonata.bank;

public class SavingsAcc extends Bank implements BankInterface{
	public void deposit(double amnt) {
		AccBal+=amnt;
		System.out.println("Bank Deposit: "+ amnt);
        System.out.println("Deposited");
	}
	
	public void withdraw(double amnt) {
		AccBal-=amnt;
		System.out.println("Withdrawn amount : "+ amnt);
        System.out.println("Withdrawn");
	}

	
	public static void main(String[] args) {
		SavingsAcc s=new SavingsAcc();
		s.setAccID(171);
		s.setAccName("Sweta");
		s.setAccBalance(5000);
		s.display();
		s.deposit(500);
		s.display();
		s.withdraw(250);
		s.display();
		System.out.println(s);

	}

}
