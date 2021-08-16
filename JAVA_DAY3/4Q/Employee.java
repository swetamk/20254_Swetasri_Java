package com.sonata;
public abstract class Employee {
	int eid;
    String ename;
	double salary;
	int leaves;
	abstract void caluclateSalary(double basicpay);
	Employee(int id,String name,double sal,int leaves){ 
		this.eid=id;
		this.ename=name;
		this.salary=salary;
		this.leaves=leaves;
	}

	
	public String toString() {
		return "Other Employees\nemployeeid: " + eid +"\n" + "employee name:" + ename +"\n"+ "salary:" + salary + "\n" + "leaves:" + leaves;
	}
	
	
}



