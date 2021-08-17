package com.sonata.bank;

public class JointAcc extends Bank implements BankInterface{
	
	
	
	public void deposit(double amnt) {
		AccBal+=amnt;
		System.out.println("Bank deposit: "+ amnt);
        System.out.println("Deposited");
	}
	
	public void withdraw(double amnt) {
		AccBal-=amnt;
		System.out.println("withdrawn amount : "+ amnt);
        System.out.println("withdrawn");
	}
	


	public static void main(String[] args) {
		JointAcc j=new JointAcc();
		j.setAccID(1710);
		j.setAccName("Sweta");
		j.setAccBalance(70000);
		
		j.display();
		System.out.println();
		j.deposit(8000);
		System.out.println();
		j.display();
		System.out.println();
		j.withdraw(2000);
		j.display();
		
		System.out.println(j);

	}

}
