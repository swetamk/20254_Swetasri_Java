package com.sonata.bank;

public class CurrentAcc extends Bank implements BankInterface {
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
		CurrentAcc j1=new CurrentAcc();
		j1.setAccID(1710);
		j1.setAccName("Sweta");
		j1.setAccBalance(70000);
		
		j1.display();
		System.out.println();
		j1.deposit(8000);
		System.out.println();
		j1.display();
		System.out.println();
		j1.withdraw(2000);
		j1.display();
		
		System.out.println(j1);
	}

}