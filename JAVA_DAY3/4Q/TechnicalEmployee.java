package com.sonata;
public class TechnicalEmployee extends Employee {
	
	TechnicalEmployee(int id, String name, double salary, int leaves) {
		super(id, name, salary, leaves);
	}
	void caluclateSalary(double salary) {
		this.salary=salary+(salary*0.12);
	}
	public String toString() {

		return "Technical Employee \nemployeeid: " + eid +"\n" + "employee name:" + ename +"\n"+ "salary:" + this.salary + "\n" + "leaves:" + leaves;
	}
	
	
}
