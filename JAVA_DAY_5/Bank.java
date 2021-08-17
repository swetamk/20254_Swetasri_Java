package com.sonata.bank;

public class Bank {
	private int ID;
	private String AccName;
	public double AccBal;
	
	

	public int getAccID() {
		return ID;
	}
	public void setAccID(int accID) {
		this.ID = accID;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		this.AccName = accName;
	}
	public double getAccBalance() {
		return AccBal;
	}
	public void setAccBalance(double Balance) {
		this.AccBal = Balance;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Bank [accID=" + ID + ", accName=" + AccName + ", accBalance=" + AccBal + "]";
	}
	public void display() {
		System.out.println("Account ID : "+ID);
		System.out.println("Account Holder Name: "+AccName);
		System.out.println("Account Balance: "+AccBal);
	}


	

}

