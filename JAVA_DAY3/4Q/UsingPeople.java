package com.sonata;
public class UsingPeople {
	public static void main(String[] args) {
		//Technical Employees
		TechnicalEmployee TE = new TechnicalEmployee(1,"abc",10000,10);
		Staff SE = new Staff(2,"xyz",7000,5);
		package com.sonata;
		TE.caluclateSalary(10000);
		SE.caluclateSalary(7000);
		System.out.println(TE.toString());
		System.out.println(SE.toString());
	}

}
