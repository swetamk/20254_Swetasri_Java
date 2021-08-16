package com.sonata;

public class Staff extends Employee{
	

	Staff(int id,String name,double salary,int leaves)
	{
		super(id,name,salary,leaves);
	}
	void caluclateSalary(double salary)
	{
		this.salary = salary + (0.18*salary);
	}

	
	public String toString() {
		return "Staff\nemployeeid: " + eid +"\n" + "employee name:" + ename +"\n"+ "salary:" + this.salary + "\n" + "leaves:" + leaves;
	}
	
	
}	